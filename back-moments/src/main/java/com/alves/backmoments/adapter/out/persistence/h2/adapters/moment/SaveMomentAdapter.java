package com.alves.backmoments.adapter.out.persistence.h2.adapters.moment;

import com.alves.backmoments.adapter.out.persistence.h2.entities.MomentEntity;
import com.alves.backmoments.adapter.out.persistence.h2.mappers.MomentPersistenceMapper;
import com.alves.backmoments.adapter.out.persistence.h2.repositories.MomentRepository;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.out.moment.SaveMomentPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveMomentAdapter implements SaveMomentPort {

    private final MomentRepository momentRepository;
    private final MomentPersistenceMapper momentPersistenceMapper;

    @Override
    public Moment save(Moment moment) {
        MomentEntity momentEntity = momentPersistenceMapper.toEntity(moment);
        momentEntity = momentRepository.save(momentEntity);
        moment = momentPersistenceMapper.toDomain(momentEntity);
        return moment;
    }
}
