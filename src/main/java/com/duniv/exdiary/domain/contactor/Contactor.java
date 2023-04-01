package com.duniv.exdiary.domain.contactor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Contactor {
    @Id
    String contactorPk;

    String employeePk;
}
