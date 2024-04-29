package com.alves.backmoments.application.domain.exceptions;

public abstract class EntityNotFoundException extends DomainException{

    protected EntityNotFoundException(String message) {
        super(message);
    }
}
