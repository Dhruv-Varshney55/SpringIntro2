package com.example.SpringIntro2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName;

    // Injecting DepartmentBean dependency
    private DepartmentBean departmentBean;

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.employeeName = "Dhruv Varshney";
        this.departmentBean = departmentBean;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentBean.getDepartmentName();
    }
}
