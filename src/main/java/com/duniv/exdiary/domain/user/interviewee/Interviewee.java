package com.duniv.exdiary.domain.user.interviewee;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.user.User;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@SuperBuilder
@DiscriminatorValue("EMPLOYEE")
public class Interviewee extends User {
    String companySerialNo;
    String userSerialNo;
    String name;
    String email;
    String phoneNumber;
}
