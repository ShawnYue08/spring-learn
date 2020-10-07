package org.westos.dao;

import org.westos.entity.Student;

/**
 * @author lwj
 * @date 2020/10/2 16:50
 */
public interface StudentDao {
    /**
     * 插入
     * @param student 学生
     */
    void insert(Student student);
}
