package com.alves.backmoments.adapter.out.persistence.h2.adapters.moment;

import com.alves.backmoments.adapter.out.persistence.h2.entities.MomentEntity;
import com.alves.backmoments.adapter.out.persistence.h2.mappers.MomentPersistenceMapper;
import com.alves.backmoments.adapter.out.persistence.h2.repositories.MomentRepository;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.out.moment.DeleteMomentPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteMomentByIdAdapter implements DeleteMomentPort {

    private final MomentRepository momentRepository;
    private final MomentPersistenceMapper momentPersistenceMapper;

    @Override
    public void delete(Moment moment) {
        MomentEntity momentEntity = momentPersistenceMapper.toEntity(moment);
        momentRepository.delete(momentEntity);
    }
}
