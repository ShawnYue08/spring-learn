package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/2 19:37
 */
public class Department {
    private Integer departmentId;
    private String departmentName;

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
