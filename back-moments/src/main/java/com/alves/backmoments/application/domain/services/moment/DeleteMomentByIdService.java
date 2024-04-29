package com.alves.backmoments.application.domain.services.moment;

import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.DeleteMomentByIdUseCase;
import com.alves.backmoments.application.ports.in.moment.FindMomentByIdUseCase;
import com.alves.backmoments.application.ports.out.moment.DeleteMomentPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteMomentByIdService implements DeleteMomentByIdUseCase {

    private final FindMomentByIdUseCase findMomentByIdUseCase;
    private final DeleteMomentPort deleteMomentPort;

    @Override
    public void delete(Long id) {
        Moment moment = findMomentByIdUseCase.findById(id);
        deleteMomentPort.delete(moment);
    }
}
