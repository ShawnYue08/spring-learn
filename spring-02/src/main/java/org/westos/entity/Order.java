package org.westos.entity;

/**
 * @author lwj
 * @date 2020/10/2 16:19
 */
public class Order {
    private String orderId;
    private String orderName;

    public Order() {
        System.out.println("Order无参构造执行");
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
