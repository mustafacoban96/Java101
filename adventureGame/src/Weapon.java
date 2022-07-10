public  class Weapon {
    private int wId;
    private int wDamage;
    private int wPrice;
    private String wName;
    public Weapon(int wId, int wDamage, int wPrice, String wName) {
        this.wId = wId;
        this.wDamage = wDamage;
        this.wPrice = wPrice;
        this.wName = wName;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public int getwDamage() {
        return wDamage;
    }

    public void setwDamage(int wDamage) {
        this.wDamage = wDamage;
    }

    public int getwPrice() {
        return wPrice;
    }

    public void setwPrice(int wPrice) {
        this.wPrice = wPrice;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1,3,35,"sword");
        weaponList[1] = new Weapon(2,2,5,"pistol");
        weaponList[2] = new Weapon(3,7,45,"rifle");
        return weaponList;
    }

    public static void showWeapons(){
        System.out.println("--------------- Weapons ---------------");

        for(Weapon weap : weapons()){
            System.out.println(weap.getwId() + "- " + weap.getwName() + " damage: " + weap.getwDamage() + " price: " + weap.getwPrice());
        }
        System.out.println("------------------------------------------");
    }
    public static Weapon selectWeapon(int id){
        for (Weapon w : weapons()){
            if(id == w.getwId()){
                return w;
            }
        }
        return null;

    }
}
