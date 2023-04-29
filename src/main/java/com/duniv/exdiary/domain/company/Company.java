package com.duniv.exdiary.domain.company;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.user.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
public class Company extends Common {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer companyId;
    String companyName;
    String corporateNumber;
    boolean confirmYn;

    @OneToMany(mappedBy = "company")
    List<Employee> employees;

}
