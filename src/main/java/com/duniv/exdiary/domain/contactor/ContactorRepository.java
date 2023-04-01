package com.duniv.exdiary.domain.contactor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactorRepository extends JpaRepository<ContactorEntity, String> {
}
