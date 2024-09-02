package com.hemocentro.exception;

public class DomainException extends RuntimeException{
    private static final Long SerialVersionUID = 1L;

    public DomainException(String mensagem){
        super(mensagem);
    }
}
