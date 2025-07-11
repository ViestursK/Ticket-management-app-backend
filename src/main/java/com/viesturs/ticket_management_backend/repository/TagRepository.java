package com.viesturs.ticket_management_backend.repository;

import com.viesturs.ticket_management_backend.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
