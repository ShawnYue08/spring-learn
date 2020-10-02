package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.User;

/**
 * @author lwj
 * @date 2020/10/2 12:04
 */
public class UserTest {
    @Test
    public void testAdd() {
        //1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //ClassPathXmlApplicationContext(String configLocation)
        //resources目录下的文件默认在classes类路径下
        //2、获取配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
