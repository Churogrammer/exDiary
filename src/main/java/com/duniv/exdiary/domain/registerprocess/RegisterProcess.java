package com.duniv.exdiary.domain.registerprocess;

import javax.persistence.Entity;

public class RegisterProcess {
    String certificationId;
    String companyId;
    String employeeId;
    String step;        // 현재 진행 스탭
    Integer stepTryCount; // 해당 단계를 몇 번 째 시도했나
    String stepStatus;  // 해당 스텝이랑 스텝의 상태 Enum으로 관리
    String fileUrl;

    // 모든 서류의 confirmYn이 true이면 해당 회사 및 계정 등록을 승인해줘야
    // Enum으로 List 진행상황 판단

}
