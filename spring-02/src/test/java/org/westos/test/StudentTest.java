package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Student;

/**
 * @author lwj
 * @date 2020/10/2 16:03
 */
public class StudentTest {
    @Test
    public void test1() {
        //测试set方法注入属性
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        //Student无参构造执行了
        //Student{studentNo='01172100', studentName='张三'}
    }

    @Test
    public void test2() {
        //测试注入空值null
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = (Student) context.getBean("student2");
        System.out.println(student);
        //Student无参构造执行了
        //Student{studentNo='04171100', studentName='null'}
    }

    @Test
    public void test3() {
        //测试属性值中含有特殊符号
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = (Student) context.getBean("student3");
        System.out.println(student);
        //Student无参构造执行了
        //Student无参构造执行了
        //Student{studentNo='02176782', studentName='<<李四>>'}
    }
}
