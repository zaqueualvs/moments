package com.alves.backmoments.application.domain.exceptions;

public class MomentNotFoundException extends EntityNotFoundException {

    public MomentNotFoundException(Long id) {
        super(String.format("Não existe um cadastro de moment com id %s!", id));
    }
}
