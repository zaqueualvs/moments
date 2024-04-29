package com.alves.backmoments.application.ports.in.moment;

import com.alves.backmoments.application.domain.models.Moment;

import java.util.List;

public interface FindAllMomentsUseCase {

    List<Moment> findAll();
}
