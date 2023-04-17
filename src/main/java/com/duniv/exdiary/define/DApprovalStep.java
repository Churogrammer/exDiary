package com.duniv.exdiary.define;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DApprovalStep {
    NO_COMPANY_INFO (0)
    , APPROVAL_REQUEST_WAITING(1)
    , APPROVAL_REQUEST_COMPLETE(2)
    , APPROVAL_COMPLETE(3)
    , APPROVAL_DENIED(4)
    ;
    private int priority;

    public int getPriority() {
        return priority;
    }
}
