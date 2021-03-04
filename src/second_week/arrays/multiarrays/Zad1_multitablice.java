package second_week.arrays.multiarrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Zad1_multitablice {
    public static void main(String[] args) {
        int[][] arr = new int [5][5];
        int value = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = value;
                value+=5;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
