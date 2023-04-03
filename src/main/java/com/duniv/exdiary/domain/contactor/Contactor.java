package com.duniv.exdiary.domain.contactor;

import com.duniv.duf.domain.Common;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
public class Contactor extends Common {
    @Id
    String contactorId;
    String employeeId;
    String companyId;
    String companyValidYn;

}
