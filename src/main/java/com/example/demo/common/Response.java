package com.example.demo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author limeiqi
 * @date 2019/12/19
 **/
@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Response() {
    }

    private boolean success;

    private String code;

    private String message;

    private T result;

    public void setResult(T result) {
        this.code = "OK";
        this.success = true;
        this.result = result;
    }
}
