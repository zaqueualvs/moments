package com.alves.backmoments.adapter.out.persistence.h2.mappers;

import com.alves.backmoments.adapter.out.persistence.h2.entities.MomentEntity;
import com.alves.backmoments.application.domain.models.Moment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MomentPersistenceMapper {

    Moment toDomain(MomentEntity mommentEntit);

    MomentEntity toEntity(Moment moment);
}
