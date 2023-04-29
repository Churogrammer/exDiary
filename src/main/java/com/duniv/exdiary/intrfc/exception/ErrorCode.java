package com.duniv.exdiary.intrfc.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    NO_COMPANY ("E001", "해당 기업은 가입이 필요합니다.")
    ;
    protected String code;
    protected String msg;
}
