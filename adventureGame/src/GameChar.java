import java.util.Scanner;

public  class GameChar {
    private int damage;
    private int health;
    private int money;
    private String CharName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;



    public GameChar(int damage, int health, int money, String CharName) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.CharName = CharName;
        this.inventory = new Inventory();
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getwDamage();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money - (this.getInventory().getWeapon().getwPrice());
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public String getCharName() {
        return CharName;
    }

    public void setCharName(String charName) {
        CharName = charName;
    }

    @Override
    public String toString() {
        return getCharName();
    }

    public void selectLocation(){
        NormalLoc location;
        System.out.println("Hey champion let's specify a place now ");
        System.out.println("*-*-*-*-*-*-*-*Safe Locations*-*-*-*-*-*-*-*");
        System.out.println("1-House\n2-Shop");
        System.out.print("Enter the safing place code(1/2): ");
        int selectLoc = input.nextInt();
        input.nextLine();

        switch (selectLoc){
            case 1:
                location = new SafeHouse(this);

                break;
            case 2:
                location = new Shop(this);
                break;

            default:
                location = new SafeHouse(this);

                break;
        }
        if(!location.onLocation()){
            System.out.println("GAME OVER");
        }

    }
    public void printInfo(){
        System.out.println("*-*-*-*-*-*-*-*-* Status *-*-*-*-*-*-*-*-*");
        System.out.println("Damage: " + this.getDamage()+ " Health : " + getHealth() + " Money: "  + this.getMoney());
    }
}
