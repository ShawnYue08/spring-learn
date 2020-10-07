package org.westos.service;

import org.westos.dao.StudentDao;
import org.westos.entity.Student;

/**
 * @author lwj
 * @date 2020/10/2 16:49
 */
public class StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void insert(Student student) {
        studentDao.insert(student);
    }
}
