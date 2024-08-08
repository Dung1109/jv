package fa.training.services;

import fa.training.entities.Customer;
import fa.training.entities.Order;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public void createCustomer(List<Customer> customers) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("----Enter customer information----");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter address: ");
                String address = scanner.nextLine();

                OrderService orderService = new OrderService();
                List<Order> orders = orderService.createOrders();

                Customer customer = new Customer(name, phoneNumber, address, orders);
                customers.add(customer);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        }
    }

    public void showAllCustomers(List<Customer> customers) {
        System.out.println("--------LIST CUSTOMERS--------");
        customers.forEach(System.out::println);
    }

    public void save(List<Customer> customers) {
        Path path = Paths.get("customers.dat");
        try {
            Files.write(path, customers.toString().getBytes());
            System.out.println("Save successfully");
        } catch (Exception e) {
            System.out.println("Save failed");
        }
    }
}
