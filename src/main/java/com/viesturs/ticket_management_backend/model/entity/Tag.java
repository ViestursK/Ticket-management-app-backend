package com.viesturs.ticket_management_backend.model.entity;

import com.viesturs.ticket_management_backend.model.entity.Workspace;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tags")

public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tag;

    private String description;

    @Column(name = "color_code")
    private String color;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;
}
