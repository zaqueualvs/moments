package com.alves.backmoments.application.domain.services.moment;

import com.alves.backmoments.application.domain.exceptions.MomentNotFoundException;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.FindMomentByIdUseCase;
import com.alves.backmoments.application.ports.out.moment.FindMomentByIdPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindMomentByIdService implements FindMomentByIdUseCase {

    private final FindMomentByIdPort findMomentByIdPort;

    @Override
    public Moment findById(Long id) {
        return findMomentByIdPort.findById(id)
                .orElseThrow(
                        () -> new MomentNotFoundException(id)
                );
    }
}
