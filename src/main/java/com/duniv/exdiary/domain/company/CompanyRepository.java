package com.duniv.exdiary.domain.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {

}
