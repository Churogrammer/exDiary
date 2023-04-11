package com.duniv.exdiary.domain.company;

import com.duniv.duf.domain.Common;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class Company extends Common {
    @Id
    String companyId;
    String companyName;
    String corporateNumber;
    boolean confirmYn;

    public Company(String companyId){
        this.companyId = companyId;
    }
}
