package org.westos.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author lwj
 * @date 2020/10/3 10:23
 */
public class FactoryBeanDemo implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setStudentName("田七");
        student.setStudentNo("716238127");
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
