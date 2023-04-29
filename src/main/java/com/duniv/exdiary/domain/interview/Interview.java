package com.duniv.exdiary.domain.interview;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.interviewschedule.InterviewSchedule;
import com.duniv.exdiary.domain.notice.Notice;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Interview extends Common {
    @Id // TODO ID generator
    String interviewId;
    String interviewName;

    // 이번 회차의 인터뷰는 해당 공고에서 몇 번째로 시행되는 인터뷰 회차인지
    Integer noticeCount;

    // 인터뷰 인원 통계
    @Embedded
    IntervieweeCountVO countVO;

    @ManyToOne
    @JoinColumn(name = "noticeId")
    protected Notice notice;

    @OneToMany(mappedBy = "interview")
    protected List<InterviewSchedule> schedules;
}
