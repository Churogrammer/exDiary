package com.duniv.duf.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class Common {
    LocalDateTime insertDt;

    String modYn;
    String modId;
    LocalDateTime modDt;

    String delYn;
    String delId;
    LocalDateTime delDt;
}
