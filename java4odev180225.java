import java.util.Scanner;

public class java4odev180225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxGrade = 0;
        int minGrade= 100;
        boolean ifUnder30 = false;
        int lessonScore = 0;
        for(int i =0; i<5;i++){
            System.out.println("Enter your grade: ");
            int note = scanner.nextInt();
            if (note>maxGrade){
                maxGrade = note;
            }
            if (note<minGrade) {
                minGrade=note;
            }
            if (note<30){
                ifUnder30 = true;
            }
            lessonScore+=note;
        }
        System.out.println("Your grades average is: " + lessonScore/5);
        System.out.println("Min Grade: "+ minGrade);
        System.out.println("Max Grade: "+ maxGrade);
        if (ifUnder30){
            System.out.println("There are courses in which you received low grades!");
        }
        if (lessonScore/5>=50){
            System.out.println("You passed the class.");
        }else{
            System.out.println("You didn't pass the class");
        }
    }
}
