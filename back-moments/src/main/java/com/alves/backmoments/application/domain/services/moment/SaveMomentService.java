package com.alves.backmoments.application.domain.services.moment;

import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.SaveMomentUseCase;
import com.alves.backmoments.application.ports.out.moment.SaveMomentPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveMomentService implements SaveMomentUseCase {

    private final SaveMomentPort saveMomentPort;

    @Override
    public Moment save(Moment moment) {
        return saveMomentPort.save(moment);
    }
}
