import java.util.Scanner;

public class java5odev190225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = 0;
        boolean orderCompleted = false;
        int soupPrice = 20;
        int mainDishPrice = 40;
        int dessertPrice = 15;
        int drinkPrice = 10;
        do {
            System.out.println("1. Soup - $20\n2. Main Dish - $40\n3. Dessert - $15\n4. Drink - $10\n5. Complete Order");
            System.out.print("Make your choose (1-5): ");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    totalAmount += soupPrice;
                    System.out.println("Soup added.");
                    break;
                case 2:
                    totalAmount += mainDishPrice;
                    System.out.println("Main dish added.");
                    break;
                case 3:
                    totalAmount += dessertPrice;
                    System.out.println("Dessert added.");
                    break;
                case 4:
                    totalAmount += drinkPrice;
                    System.out.println("Drink added.");
                    break;
                case 5:
                    orderCompleted = true;
                    break;
                default:
                    System.out.println("Invalid choose. Please try again.");
                    break;
            }
        } while (!orderCompleted);
        System.out.println("Your order has been completed.\nTotal amount: $" + totalAmount);
    }
}


