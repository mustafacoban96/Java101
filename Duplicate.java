import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] list1 = {3,7,3,3,2,9,10,21,1,33,9,1};
        for(int i : list1){
            list.add(i);
        }
        System.out.println(list.toString());
        ArrayList<Integer> duplicate = new ArrayList<>();
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0 ; j< list.size(); j++){
                if((list.get(i)).equals(list.get(j))){
                    if (i!=j){
                        duplicate.add(list.get(i));
                    }
                }
            }
        }
        System.out.println(duplicate.toString());



    }
}