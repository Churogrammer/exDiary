package com.duniv.exdiary.domain.company;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepositoryImpl {
    private final JPAQueryFactory queryFactory;

    private final QCompany qCompany = QCompany.company;
    public CompanyRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public List<Tuple> selectAllCompany(){
        return queryFactory
                .from(qCompany)
                .select(qCompany.companyId, qCompany.companyName).fetch();
    }
}
