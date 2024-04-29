package com.alves.backmoments.application.ports.out.comment;

import com.alves.backmoments.application.domain.models.Comment;

public interface SaveCommentPort {

    Comment save(Comment comment);
}
