package com.alves.backmoments.application.domain.services.moment;

import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.UpdateMomentUseCase;
import com.alves.backmoments.application.ports.out.moment.UpdateMomentPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateMomentService implements UpdateMomentUseCase {

    private final UpdateMomentPort updateMomentPort;

    @Override
    public Moment update(Moment moment) {
        return updateMomentPort.update(moment);
    }
}
