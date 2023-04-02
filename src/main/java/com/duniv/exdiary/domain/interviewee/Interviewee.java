package com.duniv.exdiary.domain.interviewee;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
public class Interviewee extends Common {
    @Id
    String intervieweePk;
}
