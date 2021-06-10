package conditional.loop_exersize;

public class sum_of_one_to_ten {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is : "+sum);
    }
}

