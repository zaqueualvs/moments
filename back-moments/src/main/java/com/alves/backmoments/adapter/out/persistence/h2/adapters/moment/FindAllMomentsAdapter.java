package com.alves.backmoments.adapter.out.persistence.h2.adapters.moment;

import com.alves.backmoments.adapter.out.persistence.h2.mappers.CycleAvoidingMappingContext;
import com.alves.backmoments.adapter.out.persistence.h2.mappers.MomentPersistenceMapper;
import com.alves.backmoments.adapter.out.persistence.h2.repositories.MomentRepository;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.out.moment.FindAllMomentsPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllMomentsAdapter implements FindAllMomentsPort {

    private final MomentRepository momentRepository;
    private final MomentPersistenceMapper momentPersistenceMapper;

    @Override
    public List<Moment> findAll() {
        return momentRepository.findAll()
                .stream()
                .map(momentEntity -> momentPersistenceMapper.toDomain(momentEntity, new CycleAvoidingMappingContext()))
                .toList();
    }
}
