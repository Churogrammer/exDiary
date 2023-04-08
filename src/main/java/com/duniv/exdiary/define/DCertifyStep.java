package com.duniv.exdiary.define;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DCertifyStep {

    INIT(0)
    , WAIT_DOCUMENT(1)
    , VERIFY_DOCUMENT(2)
    , CONFIRMED(100)
    ;

    private Integer step;
}
