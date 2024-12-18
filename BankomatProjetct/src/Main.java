import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person marcel = new Marcel();
        Operations operations = new Operations();

        System.out.println("Witaj");
        System.out.println("włóż karte");
        System.out.println("Podaj PIN");

        operations.login(marcel.codePIN());
        operations.bankOperation();







    }
}