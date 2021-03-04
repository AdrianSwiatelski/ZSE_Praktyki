package second_week.arrays.multiarrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Zad3_multitablice {
    public static void main(String[] args) {
        int[][][][][] arr5 = new int[2][2][2][2][2];
        int value = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int n = 0; n < 2; n++) {
                    for (int m = 0; m < 2; m++) {
                        for (int x = 0; x < 2; x++) {
                            arr5[i][j][n][m][x] = value;
                            value++;
                            System.out.print(arr5[i][j][n][m][x] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}