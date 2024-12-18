import java.util.Scanner;

public class Operations {
    Scanner scanner = new Scanner(System.in);
    Saldo saldo = new Saldo();


    void operation(){
        MoneyWithdrawal mw = new MoneyWithdrawal();

        System.out.println("czy chcesz zobaczyć saldo?");
        System.out.println("wybierz odpowiedz tak/nie");

        if (scanner.nextLine().equals("tak")) {
            saldo.Marcel();
            System.out.println("Czy chcesz wypłacić pieniądze?");
            if (scanner.nextLine().equals("tak")){
                mw.wypłataszmalu();
            }else{
                System.out.println("czy chcesz zobaczyć jeszcze raz saldo?");
                if (scanner.nextLine().equals("tak")) {
                    saldo.Marcel();
                }else{ System.exit(1);
                }
            }
        }else {
            System.out.println("Czy chcesz wypłacić pieniądze?");
            if (scanner.nextLine().equals("tak")) {
                mw.wypłataszmalu();
            } else {
                System.exit(1);
            }

        }
    }
}
