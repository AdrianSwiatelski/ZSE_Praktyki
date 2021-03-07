package second_week.loops.zadania_spotkanie5;

public class Zad_petle_3 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
            if (a * b % 2 == 1) {
                System.out.println("\t");
                } else {
                System.out.println(a + " * " + b + " = " + a * b);
                }
            }
        }
    }
}