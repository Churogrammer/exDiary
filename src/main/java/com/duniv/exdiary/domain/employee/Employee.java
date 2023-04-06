package com.duniv.exdiary.domain.employee;

import com.duniv.duf.domain.Common;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@SuperBuilder
@MappedSuperclass
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
    String companyId;
    boolean validateYn;
    boolean contatctorYn;

}

