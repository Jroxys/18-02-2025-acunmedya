import java.util.Scanner;

public class java2odev180225 {
    public static void main(String[] args) {
        int product1 = 1320;
        int product2 = 980;
        int product3 = 132;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("After finish shopping please enter 0 to pay.");

        String discountCode = "ACUNMEDYA";


        for (int i= 0; i<100; i++) {
            System.out.println("1-Apple Macbook M3 1320$ \n" +
                    "2-Iphone 16 Pro Max 980$ \n" +
                    "3-Fast Charger 18W 132$\n");
            System.out.println("Please choose a product to buy: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Please enter coupon code for discount(0 for no discount): ");
                    String discountCodeUser = scanner.next();
                    if (discountCodeUser.equals("0")) {
                        System.out.println("TOTAL:" + total);
                    } else if (discountCodeUser.equals(discountCode)) {
                        total = (int) (total*0.9);
                        System.out.println("TOTAL: " + total);
                    }
                    return;
                case 1:
                    total = total + product1;
                    System.out.println("Apple Macbook M3 added to cart");
                    break;
                case 2:
                    total += product2;
                    System.out.println("Iphone 16 Pro Max added to cart");
                    break;
                case 3:
                    total += product3;
                    System.out.println("Fast Charger 18W added to cart");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 0.");
                    break;
            }
        }

    }
}
