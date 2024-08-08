package fa.training.services;

import fa.training.entities.Order;
import fa.training.fa.training.utils.Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {

    public List<Order> createOrders() {
        Scanner scanner = new Scanner(System.in);

        List<Order> orders = new ArrayList<>();
        while (true) {
            try {
                System.out.println("Enter order infor:");
                System.out.println("+ number: ");
                String orderNumber = scanner.nextLine();
                if (Validator.isValidOrderNumber(orderNumber)) {
                    System.out.println("+ date(dd/MM/yyyy): ");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate orderDate = LocalDate.parse(scanner.nextLine(), formatter);
                    Order order = new Order(orderNumber, orderDate);
                    orders.add(order);
                }
                System.out.println("Do you want to continue? (Y/N)");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        }
        return orders;
    }
}
