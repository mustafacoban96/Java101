import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 5;
        int selected;
        while(true){
            System.out.println("You have "+ right + " rights.");
            System.out.print("Please enter the guess(1-100): ");
            selected = input.nextInt();
            if (selected == number){
                System.out.println("Congratulations");
                break;
            } else if (selected > number) {
                System.out.println("Please enter the smaller number");

            }else if (selected < number) {
                System.out.println("Please enter the bigger number");

            }else{
                System.out.println("Please enter the valid values");
            }
            right --;
            if(right==0){
                System.out.println("Your rights didn't remain....");
                System.out.println("The number is " + number);
                break;
            }
        }
    }
}