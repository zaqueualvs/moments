package com.alves.backmoments.adapter.out.persistence.h2.mappers;

import com.alves.backmoments.adapter.out.persistence.h2.entities.CommentEntity;
import com.alves.backmoments.application.domain.models.Comment;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentPersistenceMapper {

    Comment toDomain(CommentEntity commentEntity, @Context CycleAvoidingMappingContext context);

    CommentEntity toEntity(Comment comment, @Context CycleAvoidingMappingContext context);
}
