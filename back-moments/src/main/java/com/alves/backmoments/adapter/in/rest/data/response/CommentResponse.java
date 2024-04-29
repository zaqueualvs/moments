package com.alves.backmoments.adapter.in.rest.data.response;

import java.time.OffsetDateTime;

public record CommentResponse(
        Long id,
        String userName,
        String text,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {
}
