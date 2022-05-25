package Array.ArrayList;
import java.util.ArrayList;
public class interro4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Initial Size : "+list.size());
        //adding elements
        list.add(10); list.add(22); list.add(44); list.add(3,89);
        System.out.println(list);
        System.out.println("After adding Size : "+list.size());
        list.clear();
        System.out.println("After clear ArrayLIst contains : "+list);
        System.out.println("After clearing Size : "+list.size());
        boolean check = list.isEmpty();
        System.out.println("After clearing the list : "+check);
        list.add(259);
        list.add(689);
        list.add(999);
        System.out.println(list);
        boolean contain1 = list.contains(999);
        System.out.println("999 is in the list : "+contain1);
        boolean contain2 = list.contains(3000);
        System.out.println("3000 is in the list : "+contain2);
        int position1 = list.indexOf(999); //indexof is used to count position
        System.out.println("The index of 999 is : "+position1);
        list.set(2, 199); // set is used to replace the previous
        System.out.println("Replace the index of 999 to : "+list);
        int xx = list.get(2);
        System.out.println("Index of 2 is : "+xx);
    }
}
