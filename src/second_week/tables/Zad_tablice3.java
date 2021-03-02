package second_week.tables;
import java.util.Arrays;
import java.util.Random;
public class Zad_tablice3 {
    public static void main(String[] args) {
        Random rand=new Random();
        String[] imie_psa={"Diablo","Hades","Ivar"};
        int rand_int1 = rand.nextInt(3);
        System.out.println("Imię psa to: "+imie_psa[rand_int1]);
    }
}
