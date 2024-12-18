import java.util.Scanner;

public class Operations {
    Scanner scanner = new Scanner(System.in);
    Saldo saldo = new Saldo();
    MoneyWithdrawal mw = new MoneyWithdrawal();
    int attemps = 3;
    int yourPassword;
    int option;

    //PROCES LOGOWANIA

    public void login(int password) {
        while (true) {
            if (this.attemps >= 0) {
                this.yourPassword = this.scanner.nextInt();
                if (this.yourPassword != password) {
                    if (this.attemps > 2) {
                        System.out.println("Podałeś nieprawidłowe hasło masz jeszcze 3 próby");
                        --this.attemps;
                        continue;
                    }
                    if (this.attemps > 1) {
                        System.out.println("Podaj hasło jeszcze raz");
                        --this.attemps;
                        continue;
                    }
                    if (this.attemps > 0) {
                        System.out.println("Podaj jeszcze raz hasło została Ci ostatnia próba");
                        --this.attemps;
                        continue;
                    }
                    System.out.println("Hasło jest nieprawidłowe, Proszę odebrać kartę");
                    System.exit(1);
                    continue;
                }
                System.out.println("Podałeś prawidłowe hasło");
            }
            return;

        }
    }

//PROCES WYBIERANIA OPERACJI

    void bankOperation() {
        System.out.println("wybierz operację jaką chcesz wykonać");
        System.out.println("1 - Zobacz saldo swojego konta");
        System.out.println("2 - Wypłać pięniądze z konta");
        System.out.println("3 - Wyjmij kartę");
        do {
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    saldo.Marcel();
                    break;
                case 2:
                    mw.wypłataszmalu();
                    break;
            }
        } while (option < 3) ;{
            System.out.println("nara");
        }
    }
}


