package org.westos.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.CollectionDemo;
import org.westos.entity.CollectionDemo2;

/**
 * @author lwj
 * @date 2020/10/2 20:24
 */
public class CollectionDemoTest {
    @Test
    public void test1() {
        //测试集合类型注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        CollectionDemo demo = (CollectionDemo) context.getBean("collectionDemo");
        System.out.println(demo);
        //Student无参构造执行了
        //Student无参构造执行了
        //CollectionDemo{names=[张三, 李四], scores=[80, 87, 88], students={张三=Student{studentNo='01278641', studentName='张三'},
        // 李四=Student{studentNo='12671628', studentName='李四'}}, ids=[string, integer, char]}
    }

    @Test
    public void test2() {
        //测试util命名空间提取集合
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        CollectionDemo2 demo2 = (CollectionDemo2) context.getBean("collectionDemo2");
        System.out.println(demo2.getList());
        //Student无参构造执行了
        //Student无参构造执行了
        //[Student{studentNo='716217255', studentName='张三'}, Student{studentNo='1276312t', studentName='李四'}]
    }
}
