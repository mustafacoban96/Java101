import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public Game(){

    }
    public void start(){System.out.println("Welcome to the jungle");
        Scanner input = new Scanner(System.in);
        System.out.print("Hey warrior enter a nick name: ");
        String name = input.nextLine();
        Player gamer1 = new Player(name);
        GameChar gamer;
        System.out.println("Hello " + gamer1.getName() + " please be careful to yourself " + "the jungle is very dangerous");
        System.out.println("Now, you should choose a champion...");
        gamer = gamer1.selectChampion();
        gamer.printInfo();
        while(true) {
            gamer.selectLocation();
            gamer.printInfo();
        }








    }

}
