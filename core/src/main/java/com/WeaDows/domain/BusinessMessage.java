package com.WeaDows.domain;

import lombok.Data;


@Data
public class BusinessMessage<T> {

    private String code;

    private String msg;

    private Boolean success;

    private T data;

}
