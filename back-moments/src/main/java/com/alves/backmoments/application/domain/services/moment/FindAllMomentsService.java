package com.alves.backmoments.application.domain.services.moment;

import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.FindAllMomentsUseCase;
import com.alves.backmoments.application.ports.out.moment.FindAllMomentsPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllMomentsService implements FindAllMomentsUseCase {

    private final FindAllMomentsPort findAllMomentsPort;

    @Override
    public List<Moment> findAll() {
        return findAllMomentsPort.findAll();
    }
}
