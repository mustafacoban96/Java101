package nested;

public class Out {
    public static int number = 5;

    public static class In{
        public static int number = 10;
        public static void run(){
            int number = 1;
            System.out.println("method class : " + number + " -----------");
            System.out.println("Inner class : " + In.number + " ---------"); // Out.this.number = 5 it reaches value of outer class.
            System.out.println("Outer class : " + Out.number);
        }
    }
    public void run(){
        In.run();
    }
}
