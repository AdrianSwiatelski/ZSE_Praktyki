package second_week.tables;

import java.util.Arrays;
import java.util.Collections;

public class Zad_tablice2 {
    public static void main(String[] args) {
        String[] stringArray = {"!","&","*","Taco","ma","wąsa","^","Marcin","to","Student"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("\n Sortowanie malejące: " + Arrays.toString(stringArray));
    }
}
