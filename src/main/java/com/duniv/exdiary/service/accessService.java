package com.duniv.exdiary.service;

import com.duniv.duf.domain.tools.StringTools;
import com.duniv.exdiary.domain.employee.EmployeeEntity;
import com.duniv.exdiary.domain.employee.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class accessService {
    private final EmployeeService employeeService;
    // 로그인
    public void login(){

    }

    // 해당 아이디가 머물고 있는 스텝
    private void isConfirmId(Integer employeeId){
        EmployeeEntity entity = employeeService.findById(employeeId);
        // 승인된 직원인가?
        if(entity.isValidateYn()){
            // index 화면
            // TODO 대신 권한에 맞는 버튼만 보여줌
            return;
        }

        if(!StringTools.isEmpty(entity.getCompanyId())){
            // 담당자에게 연락해서 승인 받으세요
            return;
        }




        // 회사 Id가 존재하지 않는다면
        // 회사는 있으나 선택안함

        // or


        // 회사는 없고 등록중
        // 회사는 없고 신청도 안함
    }

}
