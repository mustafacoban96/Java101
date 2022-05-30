import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Idman sporcu1 = new Idman(10,10,10,10);

        while(sporcu1.IdmanFinish() == false){
            System.out.println("1-Burpea\n2-Pushup\n3-Situp\n4.Squad\n5-Quit");
            System.out.print("Write your train: ");
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            if(move.equals("Quit")) break;
            System.out.print("Write number of motion: ");
            int times = input.nextInt();

            sporcu1.hareketYap(move, times);

        }
        System.out.println("Your period is finished for today...");
    }
}