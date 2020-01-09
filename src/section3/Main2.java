package section3;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        long id;
        String productName;
        String supplierName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id ");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name ");
        productName = sc.nextLine();
        System.out.println("Enter the supplier name");
        supplierName = sc.nextLine();
        display(id, productName, supplierName);
        Product a = new Product(id, productName, supplierName);
        System.out.println("Enter the product id ");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name ");
        productName = sc.nextLine();
        System.out.println("Enter the supplier name ");
        supplierName = sc.nextLine();
        Product b = new Product(id, productName, supplierName);
        display(id, productName, supplierName);
        if (a.equals(b)) {
            System.out.println("The two products are the same ");
        } else {
            System.out.println("The two products are different ");
        }
        sc.close();
    }

    public static void display(Long id, String productName, String supplierName) {
        System.out.println("Product Id is" + id);
        System.out.println("Product Name is" + productName);
        System.out.println("Product Name is" + supplierName);

    }

}
