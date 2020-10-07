package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Department;
import org.westos.entity.Employee;

/**
 * @author lwj
 * @date 2020/10/2 19:44
 */
public class EmployeeTest {
    @Test
    public void test1() {
        //测试注入内部Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee);
        //Employee{employeeName='王五', employeeAge='25', department=Department{departmentId=1, departmentName='人工智能部'}}
    }

    @Test
    public void test2() {
        //测试级联赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
        //Employee{employeeName='赵六', employeeAge='26', department=Department{departmentId=2, departmentName='云平台部'}}

        Department department = (Department) context.getBean("department2");
        System.out.println(department);
        //Department{departmentId=2, departmentName='云平台部'}
    }
}
