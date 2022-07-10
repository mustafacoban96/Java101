public class Shop extends NormalLoc{
    public Shop(GameChar gamer) {
        super(gamer, "Market");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the shop...");
        System.out.println("1- Weapons\n2- Armor\n3- Exit");
        System.out.print("Which tool would you like to get: ");
        int selectCase = OnLocation.input.nextInt();
        while(selectCase<1 || selectCase>3){
            System.out.println("Please make a correct choice");
            System.out.print("choose: ");
            selectCase = input.nextInt();
        }
        switch (selectCase){
            case 1:
                Weapon.showWeapons();
                System.out.print("Which weapon: ");
                int selWeapon = input.nextInt();
                while (selWeapon <1 || selWeapon > Weapon.weapons().length){
                    System.out.println("Invalid choice please try again !!!");
                    System.out.print("Which weapon: ");
                    selWeapon = input.nextInt();
                    input.nextLine();
                }
                Weapon selectedWeapon = Weapon.selectWeapon(selWeapon);
                if(selectedWeapon != null){
                    if ((selectedWeapon.getwPrice()) > (this.getPlayer().getMoney())){
                        System.out.println("Your money are not much to the " + selectedWeapon.getwName());
                    }
                    else{
                        int balance = (this.getPlayer().getMoney())-(selectedWeapon.getwPrice());
                        System.out.println("Remain money: " + balance);
                        System.out.println("Previous weapon: " + this.getPlayer().getInventory().getWeapon().getwName());
                        this.getPlayer().getInventory().setWeapon(selectedWeapon);
                        System.out.println("New weapon: " + this.getPlayer().getInventory().getWeapon().getwName());
                    }
                }
                break;
            case 2:
                Armor.showArmors();
                System.out.print("Which armor: ");
                int selArmor = input.nextInt();
                while(selArmor <1 || selArmor > Armor.armors().length){
                    System.out.println("Invalid choice please try again !!!");
                    System.out.print("Which armor: ");
                    selArmor = input.nextInt();
                    input.nextLine();
                }
                Armor selectedArmor = Armor.selectArmor(selArmor);
                if(selectedArmor != null){
                    if((selectedArmor.getaPrice()) > (this.getPlayer().getMoney())){
                        System.out.println("Your money are not much to the " + selectedArmor.getaName());
                    }
                    else {
                        int balance = (this.getPlayer().getMoney())-(selectedArmor.getaPrice());
                        this.getPlayer().getInventory().setArmor(selectedArmor);
                        System.out.println("Remain money: " + balance);
                    }
                }
                break;
            default:
                System.out.println("Take care champion...");
                return true;
        }
        return true;
    }





}
