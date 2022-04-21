package Array;

public class mda_randomOutput1 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][5];
        int k = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                numbers[i][j] = k;
                k++; //k is where we
            }
        }
        for(int i=0; i<4; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print(" " +numbers[i][j]);
            }
            System.out.println();
        }
    }
}
