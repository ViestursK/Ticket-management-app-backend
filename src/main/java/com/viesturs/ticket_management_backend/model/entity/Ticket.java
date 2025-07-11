package com.viesturs.ticket_management_backend.model.entity;

import com.viesturs.ticket_management_backend.model.enums.Status;
import com.viesturs.ticket_management_backend.model.enums.Priority;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    private Status status;

//    @JoinColumn(name = "created_by_id")
//    private Long createdBy;

    @JoinColumn(name = "assigned_to_id")
    private Long assignedTo;

//    @ManyToOne
//    @JoinColumn(name = "workspace_id")
//    private Workspace workspace;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
