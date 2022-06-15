import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        Scanner input = new Scanner(System.in);

        /*int[][] foo = new int[][] {
        new int[] { 1, 2, 3 },
        new int[] { 1, 2, 3, 4},
    };*/

        for(int i = 0; i< A.length;i++){
            for(int j =0 ; j<A[i].length;j++){
                System.out.print("Enter the the list[" + i + "]" + "[" + j + "]: ");
                A[i][j] = input.nextInt();

            }
        }
        System.out.println("Matris: ");
        for(int i = 0; i< A.length;i++){
            for(int j =0 ; j<A[i].length;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for(int i =0; i<B.length; i++){
            for( int j=0 ; j< B[i].length ; j++){
                B[i][j] = A[j][i];
            }
        }
        for(int i =0; i<B.length; i++){
            for( int j=0 ; j< B[i].length ; j++){
                System.out.print(B[i][j] + " ");
            }System.out.println();
        }
        //https://stackoverflow.com/questions/4000169/getting-the-array-length-of-a-2d-array-in-java

    }
}