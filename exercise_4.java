import java.util.Scanner;
public class exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze");
        System.out.println("Wprowadź pierwszą liczbę: ");
        int input1 = input.nextInt();
        System.out.println("Wprowadź symbol(+ - * /)");
        int symbol = input.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int input2 = input.nextInt();

        switch (symbol) {
            case 1:
                int dodawanie = input1 + input2;
                System.out.println("Wynik dodawania tych liczb wynosi: " + dodawanie);
                break;

            case 2:
                int odejmowanie = input1 - input2;
                System.out.println("Wynik odejmowania tych liczb wynosi: " + odejmowanie);
                break;

            case 3:
                int mnozenie = input1 * input2;
                System.out.println("Wynik mnożenia tych liczb wynosi: " + mnozenie);
                break;

            case 4:
                int dzielenie = input1 / input2;
                System.out.println("Wynik dzielenia tych liczb wynosi: " + dzielenie);
                break;
        }
    }
}
