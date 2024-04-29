package com.alves.backmoments.adapter.in.rest.data.request;

import jakarta.validation.constraints.NotBlank;

public record CommentRequest(
        @NotBlank
        String userName,
        String text,
        @NotBlank
        Long momentId
) {
}
