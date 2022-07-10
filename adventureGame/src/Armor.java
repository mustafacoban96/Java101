public  class Armor {
    private int aId;
    private int aDurability;
    private int aPrice;
    private String aName;

    public Armor(int aId, int aDurability, int aPrice, String aName) {
        this.aId = aId;
        this.aDurability = aDurability;
        this.aPrice = aPrice;
        this.aName = aName;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getaDurability() {
        return aDurability;
    }

    public void setaDurability(int aDurability) {
        this.aDurability = aDurability;
    }

    public int getaPrice() {
        return aPrice;
    }

    public void setaPrice(int aPrice) {
        this.aPrice = aPrice;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }


    public static  Armor[] armors(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,1,15,"Weak armor");
        armorList[1] = new Armor(2,3,25,"Normal armor");
        armorList[2] = new Armor(3,5,35,"Strong armor");
        return armorList;
    }
    public static void showArmors(){
        System.out.println("--------------- Armors ---------------");

        for(Armor arm : armors()){
            System.out.println(arm.getaId() + "- " + arm.getaName() + " durability: " + arm.getaDurability() + " price: " + arm.getaPrice());
        }
        System.out.println("------------------------------------------");
    }
    public static Armor selectArmor(int id){
        for(Armor ar : armors()){
            if(id == ar.getaId()){
                return ar;
            }
        }
        return null;
    }

}
