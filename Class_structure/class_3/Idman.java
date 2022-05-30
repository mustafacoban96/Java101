public class Idman {
    private int burpea_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpea, int pushup, int situp, int squat){
        this.setBurpea_sayisi(burpea);
        this.setPushup_sayisi(pushup);
        this.setSitup_sayisi(situp);
        this.setSquat_sayisi(squat);
    }
    public int getBurpea_sayisi() {
        return burpea_sayisi;
    }
    public void setBurpea_sayisi(int burpea_sayisi) {
        this.burpea_sayisi = burpea_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi){
        if(hareketTuru.equals("Burpea")){
            burpeaYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        }
        else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        }
        else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        }
        else{
            System.out.println("Please enter the valid action!");
        }

    }
    public void burpeaYap(int sayi){
        if (burpea_sayisi == 0){
            System.out.println("You finished burpea");
        }
        else{
            if (burpea_sayisi - sayi >= 0 ){
                burpea_sayisi -= sayi;
                System.out.println("Remain burpea: " + burpea_sayisi);
            } else if (burpea_sayisi - sayi < 0) {
                System.out.println("You finished burpea more than enough ");
                burpea_sayisi = 0;
            }
        }
    }
    public void pushupYap(int sayi){
        if (pushup_sayisi == 0){
            System.out.println("You finished pushup");
        }
        else{
            if (pushup_sayisi - sayi >= 0 ){
                pushup_sayisi -= sayi;
                System.out.println("Remain pushup: " + pushup_sayisi);
            } else if (pushup_sayisi - sayi < 0) {
                System.out.println("You finished pushup more than enough ");
                pushup_sayisi = 0;
            }
        }
    }
    public void situpYap(int sayi){
        if (situp_sayisi == 0){
            System.out.println("You finished pushup");
        }
        else{
            if (situp_sayisi - sayi >= 0 ){
                situp_sayisi -= sayi;
                System.out.println("Remain situp: " + situp_sayisi);
            } else if (situp_sayisi - sayi < 0) {
                System.out.println("You finished situp more than enough ");
                situp_sayisi = 0;
            }
        }
    }
    public void squatYap(int sayi){
        if (squat_sayisi == 0){
            System.out.println("You finished squat");
        }
        else{
            if (squat_sayisi - sayi >= 0 ){
                squat_sayisi -= sayi;
                System.out.println("Remain pushup: " + squat_sayisi);
            } else if (squat_sayisi - sayi < 0) {
                System.out.println("You finished pushup more than enough ");
                squat_sayisi = 0;
            }
        }
    }
    public boolean IdmanFinish(){
        return (burpea_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
}
