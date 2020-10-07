package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Student;

/**
 * @author lwj
 * @date 2020/10/3 10:28
 */
public class FactoryBeanDemoTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Student student = (Student) context.getBean("factoryBeanDemo");
        System.out.println(student);
        //Student无参构造执行了
        //Student{studentNo='716238127', studentName='田七'}
    }
}
