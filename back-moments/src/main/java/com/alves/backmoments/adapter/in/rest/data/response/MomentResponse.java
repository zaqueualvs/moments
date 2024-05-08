package com.alves.backmoments.adapter.in.rest.data.response;

import org.springframework.web.multipart.MultipartFile;

import java.time.OffsetDateTime;
import java.util.Set;

public record MomentResponse(

        Long id,
        String title,
        String description,
        byte[] image,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt,
        Set<CommentResponse> comments
) {

}
