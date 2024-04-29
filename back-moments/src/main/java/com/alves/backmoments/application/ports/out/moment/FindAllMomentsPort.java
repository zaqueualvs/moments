package com.alves.backmoments.application.ports.out.moment;

import com.alves.backmoments.application.domain.models.Moment;

import java.util.List;

public interface FindAllMomentsPort {

    List<Moment> findAll();
}
