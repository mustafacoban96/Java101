import java.util.*;

public class Arraye1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        int[] list2 = {10, 20, 20, 10, 10, 20, 5, 20};
        for(int numbers : list2){
            list.add(numbers);
        }
        int total = 0;
        Set<Integer> distinct = new HashSet<>(list);
        for (Integer s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }

        

        /*for(int numbers : list2){
            list.add(numbers);
        }
        //ListIterator<Integer> iterator =  list.listIterator();

        for(int i = 0; i<list.size(); i++){
            for (int j = 0; j< list.size(); j++){
                if(list.get(i)==list.get(j) || (list.indexOf(list.get(i))) != (list.indexOf(list.get(j)))){
                        total +=1;
                        list.remove(i);

                }

            }System.out.println( list.get(i)+ " sayisi "+ total + " kez tekrar edildi.");
            total = 1;
        }*/





    }
}