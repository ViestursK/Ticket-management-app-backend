package com.viesturs.ticket_management_backend.controller;


import com.viesturs.ticket_management_backend.model.entity.Ticket;
import com.viesturs.ticket_management_backend.repository.TicketRepository;
import com.viesturs.ticket_management_backend.service.TicketService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


@RestController
@RequestMapping("/api/ticket")
public class TicketController {
    private final TicketRepository ticketRepository;
    private final TicketService ticketService;

    public TicketController(TicketRepository ticketRepository, TicketService ticketService) {
        this.ticketRepository = ticketRepository;
        this.ticketService = ticketService;
    }

    //    create ticket
    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(ticketService.createTicket(ticket));
    }

    //    get single ticket
    @GetMapping("/{ticketId}")
    public ResponseEntity<?> getTicket(@PathVariable Long ticketId) {
        try {
            return ResponseEntity.ok(ticketRepository.findById(ticketId).get());
        } catch (NoSuchElementException e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Ticket not found.");
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllTickets(){
        return ResponseEntity.ok(ticketRepository.findAll());
    }
}

