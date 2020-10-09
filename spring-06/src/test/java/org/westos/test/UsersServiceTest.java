package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Users;
import org.westos.service.UsersService;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 13:26
 */
public class UsersServiceTest {
    @Test
    public void test() {
        //测试整合方式一：SqlSessionTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersService usersService = (UsersService) context.getBean("usersServiceImpl");
        List<Users> users = usersService.selectAll();
        System.out.println(users.size());
        System.out.println(users.get(5));
    }
}
