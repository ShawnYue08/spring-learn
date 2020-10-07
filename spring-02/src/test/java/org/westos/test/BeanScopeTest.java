package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Student;
import org.westos.entity.User;

/**
 * @author lwj
 * @date 2020/10/7 12:14
 */
public class BeanScopeTest {
    @Test
    public void test1() {
        //测试默认的bean是单实例对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Student s1 = (Student) context.getBean("s");
        Student s2 = (Student) context.getBean("s");
        System.out.println(s1 == s2);
        //Student无参构造执行了
        //Student无参构造执行了
        //false
    }

    @Test
    public void test2() {
        //测试Bean的生命周期方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        User user = (User) context.getBean("user");
        System.out.println("第四步，获取到了User对象，可以使用了，" + user);
        //手动销毁Bean实例，调用destroy方法
        context.close();
    }
}
