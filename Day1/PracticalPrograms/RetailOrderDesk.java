
import java.util.*;

public class RetailOrderDesk {

    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== RETAIL ORDER DESK =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Update Order");
            System.out.println("5. Sort by Order ID");
            System.out.println("6. Sort by Customer Name");
            System.out.println("7. Sort by Product Name");
            System.out.println("8. Sort by Price");
            System.out.println("9. Binary Search");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addOrder();
                    break;

                case 2:
                    displayOrders();
                    break;

                case 3:
                    removeOrder();
                    break;

                case 4:
                    updateOrder();
                    break;

                case 5:
                    sortById();
                    break;

                case 6:
                    sortByCustomer();
                    break;

                case 7:
                    sortByProduct();
                    break;

                case 8:
                    sortByPrice();
                    break;

                case 9:
                    binarySearch();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }

    // 1. Add Order
    static void addOrder() {

        System.out.print("Enter Order ID: ");
        int id = Integer.parseInt(sc.nextLine());

        // Check duplicate Order ID
        for (Order o : orders) {
            if (o.orderId == id) {
                System.out.println("Order ID already exists!");
                return;
            }
        }

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());


        Order order = new Order(
                id, customer, product, quantity, price
        );

        orders.add(order);

        System.out.println("Order Added Successfully!");
    }

    // 2. Display Orders
    static void displayOrders() {

        if (orders.isEmpty()) {
            System.out.println("No Orders Available!");
            return;
        }

        System.out.println("\nOrderID Customer Product Quantity Price");

        for (Order o : orders) {
            System.out.println(o);
        }
    }

    // 3. Remove Order
    static void removeOrder() {

        System.out.print("Enter Order ID to Remove: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < orders.size(); i++) {

            if (orders.get(i).orderId == id) {

                orders.remove(i);

                System.out.println("Order Removed Successfully!");
                return;
            }
        }

        System.out.println("Order Not Found!");
    }

    // 4. Update Order
    static void updateOrder() {

        System.out.print("Enter Order ID to Update: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Order o : orders) {

            if (o.orderId == id) {

                System.out.print("Enter New Customer Name: ");
                o.customerName = sc.nextLine();

                System.out.print("Enter New Product Name: ");
                o.productName = sc.nextLine();

                System.out.print("Enter New Quantity: ");
                int quantity = Integer.parseInt(sc.nextLine());

                System.out.print("Enter New Price: ");
                double price = Double.parseDouble(sc.nextLine());

                if (quantity <= 0 || price < 0) {
                    System.out.println("Invalid quantity or price!");
                    return;
                }

                o.quantity = quantity;
                o.price = price;

                System.out.println("Order Updated Successfully!");
                return;
            }
        }

        System.out.println("Order Not Found!");
    }

    // 5. Sort by Order ID
    static void sortById() {

        orders.sort(Comparator.comparingInt(o -> o.orderId));

        System.out.println("Orders Sorted by Order ID!");
        displayOrders();
    }

    // 6. Sort by Customer Name
    static void sortByCustomer() {

        orders.sort(
                Comparator.comparing(
                        o -> o.customerName,
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        System.out.println("Orders Sorted by Customer Name!");
        displayOrders();
    }

    // 7. Sort by Product Name
    static void sortByProduct() {

        orders.sort(
                Comparator.comparing(
                        o -> o.productName,
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        System.out.println("Orders Sorted by Product Name!");
        displayOrders();
    }

    // 8. Sort by Price
    static void sortByPrice() {

        orders.sort(Comparator.comparingDouble(o -> o.price));

        System.out.println("Orders Sorted by Price!");
        displayOrders();
    }

    // 9. Binary Search
    static void binarySearch() {

        if (orders.isEmpty()) {
            System.out.println("No Orders Available!");
            return;
        }

        // Binary search requires sorting by Order ID
        orders.sort(Comparator.comparingInt(o -> o.orderId));

        System.out.print("Enter Order ID to Search: ");
        int id = Integer.parseInt(sc.nextLine());

        Order key = new Order(id, "", "", 0, 0);

        int index = Collections.binarySearch(
                orders,
                key,
                Comparator.comparingInt(o -> o.orderId)
        );

        if (index >= 0) {
            System.out.println("Order Found!");
            System.out.println(orders.get(index));
        } else {
            System.out.println("Order Not Found!");
        }
    }
}
