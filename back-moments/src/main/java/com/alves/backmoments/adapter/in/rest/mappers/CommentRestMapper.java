package com.alves.backmoments.adapter.in.rest.mappers;

import com.alves.backmoments.adapter.in.rest.data.request.CommentRequest;
import com.alves.backmoments.adapter.in.rest.data.response.CommentResponse;
import com.alves.backmoments.application.domain.models.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentRestMapper {

    Comment toDomain(CommentRequest commentRequest);

    CommentResponse toResponse(Comment comment);
}
