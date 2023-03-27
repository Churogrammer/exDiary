package com.duniv.duf.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class Common {
    String modYn;
    String modId;
    LocalDateTime modDt;

    String delYn;
    String delId;
    LocalDateTime delDt;
}
