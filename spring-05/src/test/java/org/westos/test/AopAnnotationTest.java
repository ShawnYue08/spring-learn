package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.User;
import org.westos.service.UserService;

/**
 * @author lwj
 * @date 2020/10/8 15:14
 */
public class AopAnnotationTest {
    @Test
    public void test() {
        //基于注解，测试方法无异常
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        User user = (User) context.getBean("user");
        userService.addUser(user);
    }

    @Test
    public void test1() {
        //基于注解，测试方法存在异常
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        User user = (User) context.getBean("user");
        userService.addUser(user);
    }
}
