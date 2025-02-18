import java.util.Scanner;

public class java3odev180225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit = 90;
        int ticketAmount = 0;
        System.out.println("Please enter your speed: ");
        int speedUser = scanner.nextInt();
        if(speedUser>90 && speedUser<=110){
            System.out.println("You're driving above speed limit your fine is: 1000$");
            ticketAmount+=1000;
        } else if (speedUser>110 && speedUser<=130) {
            System.out.println("You're driving above speed limit your fine is: 2000$");
            ticketAmount+=2000;
        }else if (speedUser>130){
            System.out.println("Your driver licence is suspended.");
        }
        else {
            System.out.println("Drive safe :)");
        }
    }
}
