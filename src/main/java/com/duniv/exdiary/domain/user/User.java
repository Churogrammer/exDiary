package com.duniv.exdiary.domain.user;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.define.EUserType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class User extends Common {
    @Id
    String userPk;
    String userId;
    String userName;
    EUserType userType;
    String email;
    String telNumber;
    String phoneNumber;
    LocalDateTime registerDt;

    public User(String userPk, String userId, String userName, EUserType userType, String email, String telNumber, String phoneNumber, LocalDateTime registerDt) {
        super();
        this.userPk = userPk;
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.email = email;
        this.telNumber = telNumber;
        this.phoneNumber = phoneNumber;
        this.registerDt = registerDt;
    }
}
