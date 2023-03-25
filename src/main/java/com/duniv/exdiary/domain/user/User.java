package com.duniv.exdiary.domain.user;

import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@NoArgsConstructor
public class User {
    @Id
    String userPk;
    String userId;
    String nickName;

}
