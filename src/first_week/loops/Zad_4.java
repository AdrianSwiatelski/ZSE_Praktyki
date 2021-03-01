package first_week.loops;
import java.util.Scanner;
public class Zad_4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = skaner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = skaner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = skaner.nextInt();
        if (a < b){
            if ( b < c){
                System.out.println("Kolejność rosnąca");
            }
        }
        if (a > b){
            if (b > c){
                System.out.println("Kolejność malejąca");
            }
        }
        if (a == b){
            if (b==c){
                System.out.println("Kolejność równa");
            }
        }
        if (a > b){
            if (b < c){
                System.out.println("Brak kolejności");
            }
        }
    }
}
