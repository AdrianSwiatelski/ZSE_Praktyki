package second_week.tables;
import java.util.Arrays;
import java.util.Random;
public class Zad_tablice4 {
    public static void main(String[] args) {
        Random rand=new Random();
        String[] potrawy={"Pizza","Kebab","Płatki","Ryż","Żelki","Jajecznica","Tosty","Naleśniki","Gofry","Gulasz"};
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        int rand_int3 = rand.nextInt(10);
        System.out.println("Na śniadanie zjem: " +potrawy[rand_int1]+"|"+" Na obiad zjem: " +potrawy[rand_int2]+"|"+" Na kolacje zjem: " +potrawy[rand_int3]);
    }
}
