package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/2 15:49
 */
public class Student {
    private String studentNo;
    private String studentName;

    public Student() {
        System.out.println("Student无参构造执行了");
    }

    /**
     * 使用set方法注入属性
     * @param studentNo 学号
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    /**
     * 使用set方法注入属性
     * @param studentName 学生姓名
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void show() {
        System.out.println("show...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
