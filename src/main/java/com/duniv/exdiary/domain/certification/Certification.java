package com.duniv.exdiary.domain.certification;

public class Certification {
    String certificationId;
    String companyId;
    String employeeId;
    String tryCount; // 회사에서 몇 번 째 시도했나
    String 제출서류이름; // ENNUm 중 하나
    String fileUrl;
    boolean confirmYn;
    // 모든 서류의 confirmYn이 true이면 해당 회사 및 계정 등록을 승인해줘야함
    // Enum으로 List 진행상황 판단

}
