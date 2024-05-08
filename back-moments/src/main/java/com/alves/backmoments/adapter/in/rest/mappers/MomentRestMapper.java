package com.alves.backmoments.adapter.in.rest.mappers;

import com.alves.backmoments.adapter.in.rest.data.request.MomentRequest;
import com.alves.backmoments.adapter.in.rest.data.response.MomentResponse;
import com.alves.backmoments.application.domain.models.Moment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.io.IOException;

@Mapper(componentModel = "spring")
public interface MomentRestMapper {

    @Mapping(source = "image.bytes", target = "image")
    Moment toDomain(MomentRequest momentRequest) throws IOException;

    MomentResponse toResponse(Moment moment);
}
