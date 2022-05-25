package Array.ArrayList;

import java.util.ArrayList;

public class interro2for_each2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Initial Size : "+list.size());
        //adding elements
        list.add(10);
        list.add(22);
        list.add(44);
        list.add(3,89);
        for(int i : list) {
            System.out.println(i+" ");
        }
        System.out.println("After adding Size : "+list.size());
    }
}
