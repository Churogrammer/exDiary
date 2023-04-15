package com.duniv.exdiary.domain.user.interviewee;

import com.duniv.duf.domain.Common;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
public class Interviewee extends Common {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer UserId;
    String companySerialNo;
    String userSerialNo;
    String name;
    String email;
    String phoneNumber;
}
