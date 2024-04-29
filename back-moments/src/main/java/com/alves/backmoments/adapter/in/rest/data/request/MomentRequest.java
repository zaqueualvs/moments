package com.alves.backmoments.adapter.in.rest.data.request;

import jakarta.validation.constraints.NotBlank;

public record MomentRequest(
        @NotBlank
        String title,
        String description,
        @NotBlank
        String image
) {

}
