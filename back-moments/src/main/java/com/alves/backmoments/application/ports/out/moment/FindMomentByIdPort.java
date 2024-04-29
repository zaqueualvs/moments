package com.alves.backmoments.application.ports.out.moment;

import com.alves.backmoments.application.domain.models.Moment;

import java.util.Optional;

public interface FindMomentByIdPort {

    Optional<Moment> findById(Long id);
}
