package second_week.tables;

import java.util.Arrays;

public class Zad_tablice1 {
    public static void main(String[] args) {
        char [] charArray = {'f' , 'c' , '$' , 'm' , '#' , 'p' , '*' , 'w' , 'u' , '@'};
        Arrays.sort(charArray);
        System.out.println("\n Sortowanie rosnące: " + Arrays.toString(charArray));
    }
}
