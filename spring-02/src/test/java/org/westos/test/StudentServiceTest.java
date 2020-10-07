package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Student;
import org.westos.service.StudentService;

/**
 * @author lwj
 * @date 2020/10/2 16:57
 */
public class StudentServiceTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.insert(new Student());
        //Student无参构造执行了
        //insert
    }
}
