package nested;

public class Locales {
    public void run(){
        class Yerel{
            private int a;
            public  Yerel(int a ){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        System.out.println("Locales works...");
        Yerel yerel = new Yerel(15);
        System.out.println("the number is " + yerel.getA());
    }
}
