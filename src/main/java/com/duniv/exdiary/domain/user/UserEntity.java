package com.duniv.exdiary.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Entity;

@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
public class UserEntity extends User{

}
