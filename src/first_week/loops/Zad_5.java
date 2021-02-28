package first_week.loops;
import java.util.Scanner;
public class Zad_5 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double a = skaner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = skaner.nextDouble();
        System.out.println("Wybierz operację do wykonania(+,-,*,/): ");
        String znak = skaner.next();
        switch (znak){
            case "+":
                double suma = a + b;
                System.out.println("Wynik dodawnia: "+suma);
                break;
            case "-":
                double różnica = a - b;
                System.out.println("Wynik odejmowania: "+różnica);
                break;
            case "*":
                double iloczyn = a * b;
                System.out.println("Wynik mnożenia: "+iloczyn);
                break;
            case "/":
                double iloraz = a / b;
                System.out.println("Wynik dzielenia: "+iloraz);
                break;
        }
    }
}
