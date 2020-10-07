package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/7 12:39
 */
public class User {
    private String name;

    public User() {
        System.out.println("第一步，User类的无参构造执行了");
    }

    public void setName(String name) {
        System.out.println("第二步，User类的setName方法执行了");
        this.name = name;
    }

    public void initMethod() {
        System.out.println("第三步，User类的初始化方法执行了");
    }

    public void destroyMethod() {
        System.out.println("第五步，User类的销毁方法执行了");
    }
}
