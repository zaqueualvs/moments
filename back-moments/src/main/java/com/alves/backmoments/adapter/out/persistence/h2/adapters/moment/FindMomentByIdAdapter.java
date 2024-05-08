package com.alves.backmoments.adapter.out.persistence.h2.adapters.moment;

import com.alves.backmoments.adapter.out.persistence.h2.entities.MomentEntity;
import com.alves.backmoments.adapter.out.persistence.h2.mappers.MomentPersistenceMapper;
import com.alves.backmoments.adapter.out.persistence.h2.repositories.MomentRepository;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.out.moment.FindMomentByIdPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindMomentByIdAdapter implements FindMomentByIdPort {

    private final MomentRepository momentRepository;
    private final MomentPersistenceMapper momentPersistenceMapper;

    @Override
    public Optional<Moment> findById(Long id) {
        Optional<MomentEntity> momentEntityOptional = momentRepository.findById(id);
        if (momentEntityOptional.isEmpty()) {
            return Optional.empty();
        }

        Moment moment = momentPersistenceMapper.toDomain(momentEntityOptional.get());
        return Optional.of(moment);
    }
}
