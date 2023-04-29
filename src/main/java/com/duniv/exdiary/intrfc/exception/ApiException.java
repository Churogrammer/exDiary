package com.duniv.exdiary.intrfc.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiException extends RuntimeException{
    protected ErrorCode code;
}
