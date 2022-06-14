import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraye1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lenght of array: ");
        int length= input.nextInt();
        int[] list = new int[length];
        for(int i = 0 ; i< list.length; i ++){
            System.out.print((i+1) + ".Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list,0,list.length);
        System.out.print("Sıralama: " + Arrays.toString(list));


    }
}