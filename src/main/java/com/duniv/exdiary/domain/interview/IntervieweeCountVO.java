package com.duniv.exdiary.domain.interview;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
public class IntervieweeCountVO {
    Integer candidateCount;
    // 대기, 예약, 취소, 완료
    Integer waitingCount;
    Integer reservedCount;
    Integer completedCount;
    Integer canceledCount;
}
