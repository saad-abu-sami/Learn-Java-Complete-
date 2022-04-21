package Array;

public class mda_randomOutput2 {
    public static void main(String[] args) {
     int[][] number = new int[4][]; //we can declare only row[4]
     //But if we will declare only column that would wrong
     //Now we declare only column in different way
        int k = 0;
     number[0] = new int[1]; //In number 0 row can only one column like the other
     number[1] = new int[2];
     number[2] = new int[3];
     number[3] = new int[4];
     for(int i=0; i<4; i++){
         for(int j=0; j<i+1; j++){
             number[i][j] = k;
             k++;
         }
     }
     for(int i=0; i<4; i++){
         for(int j=0; j<i+1; j++){
            System.out.print(number[i][j]+ " ");
         }
         System.out.println();
     }
    }
}
