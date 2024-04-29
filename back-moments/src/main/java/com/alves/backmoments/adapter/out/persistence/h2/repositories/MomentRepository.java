package com.alves.backmoments.adapter.out.persistence.h2.repositories;

import com.alves.backmoments.adapter.out.persistence.h2.entities.MomentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MomentRepository extends JpaRepository<MomentEntity, Long> {
}
