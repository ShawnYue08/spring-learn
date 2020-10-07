package org.westos.dao;

import org.westos.entity.Student;

/**
 * @author lwj
 * @date 2020/10/2 16:51
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public void insert(Student student) {
        System.out.println("insert");
    }
}
