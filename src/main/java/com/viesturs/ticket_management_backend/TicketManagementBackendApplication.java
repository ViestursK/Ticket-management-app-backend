package com.viesturs.ticket_management_backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.viesturs.ticket_management_backend.repository")

public class TicketManagementBackendApplication {
    private static final Logger logger = LoggerFactory.getLogger(TicketManagementBackendApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TicketManagementBackendApplication.class, args);
    }

}
