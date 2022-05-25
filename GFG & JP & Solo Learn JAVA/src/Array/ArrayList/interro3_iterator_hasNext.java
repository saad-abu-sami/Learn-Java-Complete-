package Array.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class interro3_iterator_hasNext {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Initial Size : "+list.size());
        //adding elements
        list.add(10);
        list.add(22);
        list.add(49);
        list.add(3,89);
        Iterator itr1 = list.iterator();
        while(itr1.hasNext()){
            System.out.println(" "+itr1.next());
        }
        System.out.println("After adding Size : "+list.size());
    }
}
