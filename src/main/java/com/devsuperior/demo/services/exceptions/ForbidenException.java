package com.devsuperior.demo.services.exceptions;

public class ForbidenException extends RuntimeException{
    public ForbidenException(String msg){
        super(msg);
    }
}
