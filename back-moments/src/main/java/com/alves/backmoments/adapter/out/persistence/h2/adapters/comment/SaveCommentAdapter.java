package com.alves.backmoments.adapter.out.persistence.h2.adapters.comment;

import com.alves.backmoments.adapter.out.persistence.h2.entities.CommentEntity;
import com.alves.backmoments.adapter.out.persistence.h2.mappers.CommentPersistenceMapper;
import com.alves.backmoments.adapter.out.persistence.h2.repositories.CommentRepository;
import com.alves.backmoments.application.domain.models.Comment;
import com.alves.backmoments.application.ports.out.comment.SaveCommentPort;
import com.alves.backmoments.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveCommentAdapter implements SaveCommentPort {

    private final CommentRepository commentRepository;
    private final CommentPersistenceMapper commentPersistenceMapper;

    @Override
    public Comment save(Comment comment) {
        CommentEntity commentEntity = commentPersistenceMapper.toEntity(comment);
        commentEntity = commentRepository.save(commentEntity);
        comment = commentPersistenceMapper.toDomain(commentEntity);
        return comment;
    }
}
