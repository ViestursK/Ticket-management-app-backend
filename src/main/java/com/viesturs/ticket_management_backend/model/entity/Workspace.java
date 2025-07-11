package com.viesturs.ticket_management_backend.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "workspaces")
@Getter
@Setter
@NoArgsConstructor
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "workspace_name")
    private String workspaceName;

    @Column(name = "created_by_user_id")
    private long createdByUserId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
