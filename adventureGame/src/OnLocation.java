import java.util.Scanner;

public abstract class OnLocation {
    private GameChar player;
    private String locName;
    public static Scanner input = new Scanner(System.in);

    public OnLocation(GameChar player, String locName) {
        this.player = player;
        this.locName = locName;
    }

    public GameChar getPlayer() {
        return player;
    }

    public void setPlayer(GameChar player) {
        this.player = player;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public abstract boolean onLocation();
}
