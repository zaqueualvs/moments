package com.alves.backmoments.adapter.in.rest.mappers;

import com.alves.backmoments.adapter.in.rest.data.request.MomentRequest;
import com.alves.backmoments.adapter.in.rest.data.response.MomentResponse;
import com.alves.backmoments.application.domain.models.Moment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MomentRestMapper {

    Moment toDomain(MomentRequest momentRequest);

    MomentResponse toResponse(Moment moment);
}
