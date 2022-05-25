package Array.ArrayList;

import java.util.ArrayList;

public class interro1_remove_element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Initial Size : "+list.size());
        //adding elements
        list.add(10);
        list.add(22);
        list.add(44);
        list.add(3,89);
        System.out.println("ArrayList contains : "+list);
        System.out.println("After adding Size : "+list.size());
        list.remove(2);
        System.out.println("After Removing ArrayList contains :  "+list);
        System.out.println("After removing Size : "+list.size());
        list.removeAll(list);
        System.out.println("After Removing ArrayList contains :  "+list);
        System.out.println("After removing Size : "+list.size());
    }
}
