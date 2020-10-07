package org.westos.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author lwj
 * @date 2020/10/7 15:25
 */
public class ConnectionTest {
    @Test
    public void test1() throws SQLException {
        //测试获取数据库连接
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        DruidDataSource druidDataSource = (DruidDataSource) context.getBean("dataSource");
        System.out.println(druidDataSource.getConnection());
        //com.mysql.jdbc.JDBC4Connection@482cd91f
    }
}
