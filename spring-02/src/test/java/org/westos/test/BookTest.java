package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.Book;

/**
 * @author lwj
 * @date 2020/10/2 16:14
 */
public class BookTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        //Student无参构造执行了
        //Book有参构造执行了
        //Book{bookName='白夜行', bookPrice=55.5}
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book1");
        System.out.println(book);
        //Student无参构造执行了
        //Book有参构造执行了
        //Order无参构造执行
        //Book有参构造执行了
        //Book{bookName='解忧杂货店', bookPrice=99.9}
    }
}
