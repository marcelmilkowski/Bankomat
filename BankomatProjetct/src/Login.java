import java.util.Scanner;

public class Login {
    int attemps = 3;
    int yourPassword;
    Scanner scanner;

    public Login() {
        this.scanner = new Scanner(System.in);
    }

    public void login(int password) {
        while(true) {
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
}
