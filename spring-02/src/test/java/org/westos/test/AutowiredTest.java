package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.dao.StudentDaoImpl;
import org.westos.service.StudentService;

/**
 * @author lwj
 * @date 2020/10/7 14:53
 */
public class AutowiredTest {
    @Test
    public void test1() {
        //测试自动注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
        StudentService studentService = (StudentService) context.getBean("studentServiceDemo");
        StudentDaoImpl impl = (StudentDaoImpl) context.getBean("studentDao");
        System.out.println(studentService.getStudentDao() == impl);
        //true
    }
}
