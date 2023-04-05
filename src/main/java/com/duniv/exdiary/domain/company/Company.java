package com.duniv.exdiary.domain.company;

import com.duniv.duf.domain.Common;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class Company extends Common {
    @Id
    String companyId;
    String companyName;
    String corporateNumber;

    // TODO 인증여부 컬럼 이름 뭐로하지
}
