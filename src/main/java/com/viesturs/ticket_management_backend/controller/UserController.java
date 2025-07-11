package com.viesturs.ticket_management_backend.controller;

import com.viesturs.ticket_management_backend.model.entity.User;
import com.viesturs.ticket_management_backend.repository.UserRepository;
import com.viesturs.ticket_management_backend.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Tag(name = "Users", description = "User management APIs")
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Operation(summary = "Create a new user")
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {

        try {
            User createdUser = userService.createUser(user);
            return ResponseEntity.ok(createdUser);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Email already in use");
        }
    }

    @Operation(summary = "Get user by ID")
    @GetMapping("/{userid}")
    public ResponseEntity<?> getUser(@PathVariable long userid) {
        try {
            return ResponseEntity.ok(userRepository.findById(userid).get());
        } catch (NoSuchElementException e) {
            return ResponseEntity.badRequest().body("User not found! ");
        }
    }
}
