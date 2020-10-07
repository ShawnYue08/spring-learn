package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/2 16:11
 */
public class Book {
    private String bookName;
    private double bookPrice;

    public Book() {
    }

    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        System.out.println("Book有参构造执行了");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
