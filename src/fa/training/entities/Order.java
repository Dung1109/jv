package fa.training.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderNumber;
    private LocalDate orderDate;

    public Order() {
    }

    public Order(String orderNumber, LocalDate orderDate) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
