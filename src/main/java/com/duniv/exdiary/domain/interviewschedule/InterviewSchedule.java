package com.duniv.exdiary.domain.interviewschedule;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.interview.Interview;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class InterviewSchedule extends Common {
    @Id // TODO Id generator
    String id;

    @ManyToOne
    @JoinColumn(name = "interviewId")
    Interview interview;

    LocalDateTime startDt;
    LocalDateTime endDt;

}
