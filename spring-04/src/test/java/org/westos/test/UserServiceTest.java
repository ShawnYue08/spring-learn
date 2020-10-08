package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.User;
import org.westos.service.UserService;
import org.westos.service.impl.UserServiceImpl;
import sun.nio.cs.US_ASCII;

/**
 * @author lwj
 * @date 2020/10/7 19:42
 */
public class UserServiceTest {
    @Test
    public void test() {
        //测试前置增强和后置增强
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = new User();
        user.setUserId("001");
        user.setUsername("lucy");
        user.setUserPwd("admin");
        UserService userService = (UserService) context.getBean("userService");
        //基于接口的动态代理
        //第一次在强转时，强转为UserServiceImpl，执行报错，动态代理类$Proxy6不能强转为UserServiceImpl
        //也是啊，同样是UserService的接口，就好比猫不能强转为狗
        userService.addUser(user);
    }

    @Test
    public void test1() {
        //测试异常抛出增强
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = new User();
        user.setUserId("002");
        user.setUsername("lisa");
        user.setUserPwd("admin");
        UserService userService = (UserService) context.getBean("userService");
        //调用UserService的addUser(User user)方法，抛出异常，当抛出异常时，会有增强代码执行
        userService.addUser(user);
    }

    @Test
    public void test2() {
        //测试最终增强
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = new User();
        user.setUserId("003");
        user.setUsername("jack");
        user.setUserPwd("admin");
        UserService userService = (UserService) context.getBean("userService");
        //调用UserService的addUser(User user)方法，抛出异常，当抛出异常时，会有增强代码执行，最终增强同样会执行
        userService.addUser(user);
    }

    @Test
    public void test3() {
        //测试环绕增强
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = new User();
        user.setUserId("004");
        user.setUsername("jenny");
        user.setUserPwd("admin");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(user);
    }
}
