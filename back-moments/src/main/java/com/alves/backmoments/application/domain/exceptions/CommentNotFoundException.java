package com.alves.backmoments.application.domain.exceptions;

public class CommentNotFoundException extends EntityNotFoundException {

    public CommentNotFoundException(Long id) {
        super(String.format("Não existe um cadastro de comment com id %s!", id));
    }
}
