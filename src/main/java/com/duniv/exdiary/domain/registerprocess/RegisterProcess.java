package com.duniv.exdiary.domain.registerprocess;

import com.duniv.duf.domain.tools.StringTools;
import com.duniv.exdiary.define.DApprovalStep;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RegisterProcess {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String companyId;
    String employeeId;
    Integer tryNumber; // 해당 단계를 몇 번 째 시도했나
    DApprovalStep preStep;  // 이전에 어떤 단계였나?
    DApprovalStep nowStep;

    // 모든 서류의 confirmYn이 true이면 해당 회사 및 계정 등록을 승인해줘야
    // Enum으로 List 진행상황 판단

    public RegisterProcess(String companyId, String employeeId){
        this.companyId = companyId;
        this.employeeId = employeeId;
        this.tryNumber = 0;
        this.preStep = null;
        this.nowStep = StringTools.isEmpty(companyId) ? DApprovalStep.NO_COMPANY_INFO : DApprovalStep.APPROVAL_REQUEST_WAITING;
    }
}
