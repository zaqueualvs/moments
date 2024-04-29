package com.alves.backmoments.application.ports.in.comment;

import com.alves.backmoments.application.domain.models.Comment;

public interface SaveCommentUseCase {

    Comment save(Comment comment);
}
