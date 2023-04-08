package com.duniv.exdiary.define;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DCertifyStep {

    INIT(1)
    , CERTIFICATION_REQUEST(2)
    ;

    private Integer step;
}
