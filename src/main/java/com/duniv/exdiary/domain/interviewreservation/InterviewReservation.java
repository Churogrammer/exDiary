package com.duniv.exdiary.domain.interviewreservation;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@NoArgsConstructor
@MappedSuperclass
public class InterviewReservation extends Common {
    @Id
    String interviewReservationId;
    String intervieweePk;
}
