import java.sql.SQLOutput;
import java.util.Scanner;
public class klasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź liczbe 1: ");
        int a = input.nextInt();

        System.out.println("Wprowadź liczbe 2: ");
        int b = input.nextInt();

        System.out.println("Wprowadź liczbe 3: ");
        int c = input.nextInt();

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);


        System.out.println("Najwieksza liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
        //
    }
}
