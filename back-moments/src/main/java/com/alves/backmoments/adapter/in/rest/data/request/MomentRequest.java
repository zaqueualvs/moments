package com.alves.backmoments.adapter.in.rest.data.request;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

public record MomentRequest(
        @NotBlank
        String title,
        String description,
        MultipartFile image
) {

}
