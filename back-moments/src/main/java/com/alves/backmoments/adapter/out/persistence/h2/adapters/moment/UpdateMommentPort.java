package com.alves.backmoments.adapter.out.persistence.h2.adapters.moment;

import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.out.moment.SaveMomentPort;
import com.alves.backmoments.application.ports.out.moment.UpdateMomentPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdateMommentPort implements UpdateMomentPort {

    private final SaveMomentPort saveMomentPort;

    @Override
    public Moment update(Moment moment) {
        return saveMomentPort.save(moment);
    }
}
