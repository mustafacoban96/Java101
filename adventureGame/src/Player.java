import java.util.Scanner;

public class Player {
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameChar selectChampion(){
        GameChar hero;
        GameChar[] charList = {new Samurai(), new Archer(),new Knight()};
        System.out.println("*-*-*-*-*-*-*-*Charaters*-*-*-*-*-*-*-*");
        System.out.println("1- " + charList[0].toString() +" damage: " +
                charList[0].getDamage() + " health: " + charList[0].getHealth()+ " money: " + charList[0].getMoney() + "\n" +
                "2- " + charList[1].toString() + " damage " +  charList[1].getDamage() + " health: " + charList[1].getHealth()+ " money: " + charList[1].getMoney() + "\n" +
                "3- " + charList[2].toString() +" damage " +  charList[0].getDamage() + " health: " + charList[2].getHealth()+ " money: " + charList[2].getMoney() + "\n" );

        System.out.print("Choose a enormous champion: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice){
            case 1:
                 hero = charList[0];
                 System.out.println("You have chosen " + hero.toString());

                break;

            case 2:
                hero = charList[1];
                System.out.println("You have chosen " + hero.toString());

                break;

            case 3:
                hero = charList[2];
                System.out.println("You have chosen " + hero.toString());

                break;

            default:
                hero = charList[0];

                break;

        }

        return hero;

    }


}
