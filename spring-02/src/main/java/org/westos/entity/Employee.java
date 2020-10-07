package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/2 19:37
 */
public class Employee {
    private String employeeName;
    private String employeeAge;
    private Department department;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                ", department=" + department +
                '}';
    }
}
