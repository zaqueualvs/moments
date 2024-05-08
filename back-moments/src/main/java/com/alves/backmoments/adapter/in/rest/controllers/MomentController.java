package com.alves.backmoments.adapter.in.rest.controllers;

import com.alves.backmoments.adapter.in.rest.data.request.MomentRequest;
import com.alves.backmoments.adapter.in.rest.data.response.MomentResponse;
import com.alves.backmoments.adapter.in.rest.mappers.MomentRestMapper;
import com.alves.backmoments.application.domain.models.Moment;
import com.alves.backmoments.application.ports.in.moment.FindAllMomentsUseCase;
import com.alves.backmoments.application.ports.in.moment.FindMomentByIdUseCase;
import com.alves.backmoments.application.ports.in.moment.SaveMomentUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "api/moments")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200/")
public class MomentController {
    private final FindAllMomentsUseCase findAllMomentsUseCase;
    private final FindMomentByIdUseCase findMomentByIdUseCase;
    private final SaveMomentUseCase saveMomentUseCase;
    private final MomentRestMapper momentRestMapper;

    @GetMapping
    public ResponseEntity<List<MomentResponse>> findAll() {
        List<MomentResponse> momentResponseList = findAllMomentsUseCase.findAll()
                .stream()
                .map(momentRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(momentResponseList);
    }

    @PostMapping
    public ResponseEntity<MomentResponse> save(@ModelAttribute @Valid MomentRequest momentRequest) {
        MomentResponse momentResponse = null;
        try {
            Moment moment = momentRestMapper.toDomain(momentRequest);
            moment = saveMomentUseCase.save(moment);
            momentResponse = momentRestMapper.toResponse(moment);
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(momentResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MomentResponse> findById(@PathVariable Long id) {
        Moment moment = findMomentByIdUseCase.findById(id);
        MomentResponse momentResponse = momentRestMapper.toResponse(moment);
        return ResponseEntity.status(HttpStatus.OK).body(momentResponse);
    }
}
