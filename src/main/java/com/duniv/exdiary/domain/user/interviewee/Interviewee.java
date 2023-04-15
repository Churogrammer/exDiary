package com.duniv.exdiary.domain.interviewee;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@NoArgsConstructor
@MappedSuperclass
public class Interviewee extends Common {
    // Id
    // UserId;
    String companySerialNo;
    String userSerialNo;
    String name;
    String email;
    String phoneNumber;
}
