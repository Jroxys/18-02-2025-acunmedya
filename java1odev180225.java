import java.util.Scanner;

public class java1odev180225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinCode = 1597;
        System.out.print("Enter your pin code: ");
        int pinCodeUser = scanner.nextInt();
        int balance = 5000;
        boolean isCorrect = false;
        if (pinCode == pinCodeUser){
            System.out.println("Correct PIN!");
            isCorrect = true;
            while (isCorrect){
                System.out.println("1-Balance" +
                        "2-Invest" +
                        "3-Withdraw" +
                        "4-Exit");
                System.out.println("Please choose an option.");
                int choose = scanner.nextInt();

                if(choose == 1){
                    System.out.println(balance);
                }else if (choose == 2){
                    System.out.println("Enter Invest Amount: ");
                    int investMoney = scanner.nextInt();
                    balance+=investMoney;
                }else if(choose == 3){
                    System.out.println("Enter Withdraw Amount: ");
                    int withdrawMoney = scanner.nextInt();
                    if(withdrawMoney <= balance){
                        System.out.println("Succesful Withdraw");
                        balance-= withdrawMoney;
                    } else {
                        System.out.println("You entered invalid amount.");
                    }
                } else if (choose == 4) {
                    break;
                }else {
                    System.out.println("Please enter correct option.");
                }

            }
        }else {
            System.out.println("Wrong pin code");
        }

    }

}



