package com.viesturs.ticket_management_backend.repository;

import com.viesturs.ticket_management_backend.model.entity.TicketMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketMessageRepository extends JpaRepository<TicketMessage, Long> {

}
