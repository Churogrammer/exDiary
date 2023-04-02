package com.duniv.exdiary.domain.contactor;

import com.duniv.duf.domain.Common;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Contactor extends Common {
    @Id
    String contactorPk;

    String employeePk;
}
