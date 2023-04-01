package com.duniv.exdiary.domain.company;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Company {
    @Id
    String companyPk;
    String companyName;
    String corporateNumber;

    // TODO 인증여부 컬럼 이름 뭐로하지
}
