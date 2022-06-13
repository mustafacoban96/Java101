import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {15,12,788,1,-1,-778,2,0};
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();

        for(int numbers : array ){
            if(number>numbers){
                min.add(numbers);
            }
            else {
                max.add(numbers);
            }
        }
        min.sort(Comparator.naturalOrder());
        max.sort(Comparator.naturalOrder());


        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min.get((min.size()-1)));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max.get(0));
    }
}