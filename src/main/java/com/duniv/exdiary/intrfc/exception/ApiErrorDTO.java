package com.duniv.exdiary.intrfc.exception;


public class ApiErrorDTO {
    protected String code;
    protected String msg;

    public ApiErrorDTO(ErrorCode code){
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

}
