package com.duniv.exdiary.intrfc.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    NO_COMPANY ("E001", "해당 기업은 가입이 필요합니다."),
    EXIST_LOGIN_ID("E002","이미 존재하는 ID 입니다." ),
    NOT_CONFIRMED_COMPANY("E003", "승인이 필요한 기업입니다.");
    protected String code;
    protected String msg;
}
