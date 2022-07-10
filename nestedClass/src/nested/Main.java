package nested;

public class Main {
    public static void main(String[] args) {
        /*Out o = new Out();
        o.run();*/

        /*Locales loc = new Locales();
        loc.run();*/

        Anonim a = new Anonim(){
            public int a = 15;
            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Method is overrided for object...");
                print();
            }
            public void print(){
                System.out.println("method is created inside the object class but we can't reach the method" +
                        " via object. we can reach the method via overrided method(xxx a.print() xxxx)");
            }
        };

        a.run();
    }
}