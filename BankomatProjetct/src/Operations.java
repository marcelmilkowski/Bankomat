
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class Operations extends People{
    Scanner scanner = new  Scanner(System.in);
    int attemps = 3;
    People people = new People();
    int codePIN;
    int numberOfOption;

    // OPERACJA LOGOWANIA DO BANKU
    void login() {
    while (true) {
        people.addToMap();
        codePIN = scanner.nextInt();
            if (!Osoby.containsKey(codePIN)) {
                if (attemps > 2) {
                        System.out.println("Podałeś nieprawidłowe hasło masz jeszcze 3 próby");
                        --attemps;
                    continue;
                    }
                    if (attemps > 1) {
                        System.out.println("Podaj hasło jeszcze raz");
                        --attemps;
                    continue;
                }
                    if (attemps > 0) {
                        System.out.println("Podaj jeszcze raz hasło została Ci ostatnia próba");
                        --attemps;
                    continue;
                    }
            System.out.println("Hasło jest nieprawidłowe, Proszę odebrać kartę");
            System.exit(1);
            continue;
        }
        break;
        }
    }
     // OPERACJA WYBORU
    void CheckingOperation(){
        do {
            System.out.println("WYBIERZ OPCJE");
            System.out.println("Opcja 1. Sprawdź saldo");
            System.out.println("Opcja 2. Wypłać pieniądzę");
            System.out.println("Opcja 3. Wpłać pieniądzę");
            System.out.println("Opcja 4. Wyloguj");

            numberOfOption = scanner.nextInt();
                switch(numberOfOption) {
                    case 1:
                        System.out.printf("Twoje saldo wynosi: "+ "%.2f", Osoby.get(codePIN).getBalance());
                        System.out.println("zł");
                    break;
                    case 2:
                        System.out.println("Wypłata pieniędzy");
                        System.out.println("Podaj kwotę jaką chcesz wypłacić");
                        double withdraw = scanner.nextInt();
                        Osoby.get(codePIN).setBalanceWithdraw(withdraw);
                    break;
                    case 3:
                        System.out.println("Wpłata pieniędzy");
                        System.out.println("Podaj kwotę jaką chcesz wpłacić");
                        double payment = scanner.nextInt();
                        Osoby.get(codePIN).setBalancePayment(payment);
                    default:
                    System.out.println("Wylogowano, dziękujemy za skorzystanie z naszych usług.");
                    }
        } while (numberOfOption != 4);

    }




}




