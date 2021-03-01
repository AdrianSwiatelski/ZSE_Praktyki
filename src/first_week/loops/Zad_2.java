package first_week.loops;
import java.util.Scanner;
public class Zad_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = skaner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = skaner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = skaner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Największa liczba to: " + a);
            }
        }
        if (a < b) {
            if (c < b) {
                System.out.println("Największa liczba to: " + b);
            }
        }
        if (a > b) {
            if (a < c) {
                System.out.println("Największa liczba to: " + c);
            }
        }
    }
}