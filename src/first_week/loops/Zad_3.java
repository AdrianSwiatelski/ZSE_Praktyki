package first_week.loops;
import java.util.Scanner;
public class Zad_3 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String login1 = "Goku";
        String haslo1 = "Kamehameha";
        System.out.println("Podaj login: ");
        String login = skaner.next();
        System.out.println("Podaj haslo: ");
        String haslo = skaner.next();
        if(login1.equals(login)){
            if(haslo1.equals(haslo)){
                System.out.println("Zalogowano pomyślnie");
            }else{
                System.out.println("Podano zły login lub hasło");
            }
        }else{
            System.out.println("Podano zły login lub hasło");
        }
    }
}
