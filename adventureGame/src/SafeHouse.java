public class SafeHouse extends NormalLoc{
    public SafeHouse(GameChar gamer) {
        super(gamer, "House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at home");
        System.out.println("Your health is refreshed...");
        return true;
    }
}
