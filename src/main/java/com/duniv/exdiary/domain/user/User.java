package com.duniv.exdiary.domain.user;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.define.DUserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "UType")
public class User extends Common {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;
    String name;
    String phoneNumber;
    String email;
}
