import java.util.Scanner;

public class Login {
    int attemps = 3;
    int yourPassword;
    Scanner scanner = new Scanner(System.in);

    public void login(int password){

        while (attemps >= 0) {
            this.yourPassword = scanner.nextInt();

            if (yourPassword == password) {
                System.out.println("Podałeś prawidłowe hasło");
                break;
            } else if (attemps > 2) {
                System.out.println("Podałeś nieprawidłowe hasło masz jeszcze 3 próby");
                this.attemps--;
            } else if (attemps > 1) {
                System.out.println("Podaj hasło jeszcze raz");
                this.attemps--;
            } else if(attemps > 0){
                System.out.println("Podaj jeszcze raz hasło została Ci ostatnia próba");
                this.attemps--;
            } else {
                System.out.println("Hasło jest nieprawidłowe, Proszę odebrać kartę");
                System.exit(1);
            }
        }
    }

}
