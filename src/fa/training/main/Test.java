package fa.training.main;

import fa.training.entities.Customer;
import fa.training.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        CustomerService customerService = new CustomerService();


        while (true) {
            menu();
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        customerService.createCustomer(customers);
                        customerService.save(customers);
                        break;
                    case 2:
                        customerService.showAllCustomers(customers);
                        break;
                    case 3:
                        System.out.println("Search customer by name");
                        break;
                    case 4:
                        System.out.println("Remove customer");
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid input, please try again");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        }
    }

    public static void menu() {
        System.out.println("==== Customer Management System ====");
        System.out.println("Choose function:");
        System.out.println("1. Add new customer");
        System.out.println("2. Show all customers");
        System.out.println("3. Search customer by name");
        System.out.println("4. Remove customer");
        System.out.println("5. Exit");
    }
}
