package com.example.demo.util;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ServerNotFoundException extends RuntimeException {

    public ServerNotFoundException(String msg){
        super(msg);
    }


}
