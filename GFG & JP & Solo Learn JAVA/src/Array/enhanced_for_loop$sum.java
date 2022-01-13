package Array;

public class enhanced_for_loop$sum {
    public static void main(String[] args) {
        int[] num = {11,22,33,44,55,66,77,88,99};
        int sum = 0;
        //now we work with for each to print all the array value
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum of all the array numbers is: " +sum);
    }
}
