package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Order;

/**
 * @author lwj
 * @date 2020/10/2 16:24
 */
public class OrderTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Order order = (Order) context.getBean("order");
        System.out.println(order);
        //Student无参构造执行了
        //Book有参构造执行了
        //Order无参构造执行
        //Order{orderId='202010021623', orderName='联想笔记本电脑-拯救者'}
    }
}
