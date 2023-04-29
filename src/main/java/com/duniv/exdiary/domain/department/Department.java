package com.duniv.exdiary.domain.department;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.notice.Notice;
import com.duniv.exdiary.domain.user.employee.Employee;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Department extends Common {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer departmentId;
    String departmentShortName;
    String departmentFullName;

    @OneToMany(mappedBy = "department")
    List<Notice> notices;
}
