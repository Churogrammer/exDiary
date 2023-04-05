package com.duniv.exdiary.domain.company;

import com.duniv.exdiary.domain.company.QCompanyEntity;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepositoryImpl {
    private final JPAQueryFactory queryFactory;

    private final QCompanyEntity qCompany = QCompanyEntity.companyEntity;
    public CompanyRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public List<Tuple> selectAllCompany(){
        return queryFactory
                .from(qCompany)
                .select(qCompany.companyId, qCompany.companyName).fetch();
    }
}
