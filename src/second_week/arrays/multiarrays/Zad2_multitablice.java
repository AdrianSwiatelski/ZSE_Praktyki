package second_week.arrays.multiarrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Zad2_multitablice {
    public static void main(String[] args) {
        int[][][][] arr4 = new int[3][3][3][3];
        int value = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int n = 0; n < 3; n++) {
                    for (int m = 0; m < 3; m++) {
                        arr4[i][j][n][m] = value;
                        value++;
                        System.out.print(arr4[i][j][n][m] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
