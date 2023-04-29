package com.duniv.exdiary.service;

import com.duniv.duf.domain.tools.StringTools;
import com.duniv.exdiary.domain.user.employee.Employee;
import com.duniv.exdiary.domain.user.employee.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class accessService {
    private final EmployeeService employeeService;
    // 로그인
    public void canAccessIndex(Integer userId){
        // 승인되지 않은 아이디라면 승인 대기 요청
        Employee employee = employeeService.getEmployeeByUserId(userId);
        if(!employee.isValidateYn()){
            // 승인 단계가 어디까지 왔나?
            // 승인 완료 요청
            return;
        }

    }

    // 해당 아이디가 머물고 있는 스텝
    private void isConfirmId(Integer id){
        Employee employee = employeeService.getEmployeeByUserId(id);
        // 승인된 직원인가?
        if(employee.isValidateYn()){
            // index 화면
            // TODO 대신 권한에 맞는 버튼만 보여줌
            return;
        }

        if(null != employee.getCompany().getCompanyId()){
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
