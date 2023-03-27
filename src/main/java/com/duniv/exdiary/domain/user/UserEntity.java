package com.duniv.exdiary.domain.user;

import com.duniv.exdiary.define.EUserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Entity
@SuperBuilder
@NoArgsConstructor
public class UserEntity extends User{
    public UserEntity(String userPk, String userId, String userName, EUserType userType, String email, String telNumber, String phoneNumber) {
        super(userPk, userId, userName, userType, email, telNumber,phoneNumber, LocalDateTime.now());
    }
}
