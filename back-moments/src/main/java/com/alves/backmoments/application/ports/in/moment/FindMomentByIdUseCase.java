package com.alves.backmoments.application.ports.in.moment;

import com.alves.backmoments.application.domain.models.Moment;

public interface FindMomentByIdUseCase {

    Moment findById(Long id);
}
