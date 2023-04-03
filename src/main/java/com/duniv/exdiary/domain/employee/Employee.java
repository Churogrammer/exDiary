package com.duniv.exdiary.domain.employee;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;

@SuperBuilder
@NoArgsConstructor
public class Employee extends Common {
    @Id
    Integer employeeId;
    String employeeLoginId;
    String employeePw;
    String employeeName;
    String employeeDepartmentId;
    String employeeTel;
    String employeeEmail;

}
