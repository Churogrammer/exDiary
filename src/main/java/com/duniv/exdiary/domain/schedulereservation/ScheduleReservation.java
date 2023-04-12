package com.duniv.exdiary.domain.schedulereservation;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@NoArgsConstructor
@MappedSuperclass
public class ScheduleReservation extends Common {
    @Id
    String interviewReservationId;
    String intervieweePk;
}
