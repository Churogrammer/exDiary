package com.duniv.exdiary.domain.notice;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.department.Department;
import com.duniv.exdiary.domain.interview.Interview;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Notice extends Common {
    @Id //TODO notice ID generator 필요
    String noticeId;
    String noticeName;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    Department department;

    @OneToMany(mappedBy = "notice")
    protected List<Interview> interviews;
}
