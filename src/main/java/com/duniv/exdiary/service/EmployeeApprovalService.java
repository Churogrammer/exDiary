package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.registerprocess.RegisterProcess;

public class EmployeeApprovalService {


    public void initApproval(String companyId, String employeeId){
        // 해당 계정에 companyId가 있나?
        // 있으면 request 요청
        RegisterProcess process = new RegisterProcess(companyId, employeeId);

        // 없으먄 request no company id
    }

    // 회사 -> 직원 승인요
    public void updateApproval(String companyId, String employeeId){
        // 승인 요청 테이블 필
    }
}
