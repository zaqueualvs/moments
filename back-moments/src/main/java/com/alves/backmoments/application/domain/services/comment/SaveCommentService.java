package com.alves.backmoments.application.domain.services.comment;

import com.alves.backmoments.application.domain.models.Comment;
import com.alves.backmoments.application.ports.in.comment.SaveCommentUseCase;
import com.alves.backmoments.application.ports.out.comment.SaveCommentPort;
import com.alves.backmoments.common.UseCase;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveCommentService implements SaveCommentUseCase {

    private final SaveCommentPort saveCommentPort;

    @Override
    public Comment save(Comment comment) {
        return saveCommentPort.save(comment);
    }
}
