package com.alves.backmoments.adapter.out.persistence.h2.repositories;

import com.alves.backmoments.adapter.out.persistence.h2.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
