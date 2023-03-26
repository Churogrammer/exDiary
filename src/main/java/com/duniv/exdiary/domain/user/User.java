package com.duniv.exdiary.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class User {
    @Id
    String userPk;
    String userId;
    String nickName;

    public void updateNickName(String nickName) {
        this.nickName = nickName;
    }

}
