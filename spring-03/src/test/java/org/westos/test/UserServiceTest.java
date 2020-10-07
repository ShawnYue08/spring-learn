package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.config.SpringConfig;
import org.westos.service.UserService;

/**
 * @author lwj
 * @date 2020/10/7 16:07
 */
public class UserServiceTest {
    @Test
    public void test() {
        //测试@Service + context:component-scan标签
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
        //serviceAdd
    }

    @Test
    public void test1() {
        //测试@Autowired + @Qualifier(value="")
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void test2() {
        //测试完全注解开发
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
