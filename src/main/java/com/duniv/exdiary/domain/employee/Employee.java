package com.duniv.exdiary.domain.employee;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
public class Employee extends Common {
    @Id
    String employeePk;
}
