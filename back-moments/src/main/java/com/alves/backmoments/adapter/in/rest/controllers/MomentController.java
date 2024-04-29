package com.alves.backmoments.adapter.in.rest.controllers;

import com.alves.backmoments.adapter.in.rest.data.response.MomentResponse;
import com.alves.backmoments.adapter.in.rest.mappers.MomentRestMapper;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.FindAllMomentsUseCase;
import com.alves.backmoments.application.ports.in.moment.FindMomentByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/moments")
@RequiredArgsConstructor
public class MomentController {
    private final FindAllMomentsUseCase findAllMomentsUseCase;
    private final FindMomentByIdUseCase findMomentByIdUseCase;
    private final MomentRestMapper momentRestMapper;

    @GetMapping
    public ResponseEntity<List<MomentResponse>> findAll() {
        List<MomentResponse> momentResponseList = findAllMomentsUseCase.findAll()
                .stream()
                .map(momentRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(momentResponseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MomentResponse> findById(@PathVariable Long id) {
        Moment moment = findMomentByIdUseCase.findById(id);
        MomentResponse momentResponse = momentRestMapper.toResponse(moment);
        return ResponseEntity.status(HttpStatus.OK).body(momentResponse);
    }
}
