package com.duniv.exdiary.domain.contactor;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@SuperBuilder
@NoArgsConstructor
public class ContactorEntity extends Contactor {
}
