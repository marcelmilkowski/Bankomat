
public class Main extends Login {
    public Main() {
    }
    static Saldo saldo = new Saldo();

    public static void main(String[] args) {
        System.out.println("Witaj");
        System.out.println("włóż karte");
        System.out.println("Podaj PIN");
        Login login = new Login();

        login.login(3314);

        System.out.println("Podałeś prawidłowe hasło");
        System.out.println("czy chcesz zobaczyć saldo?");
        saldo.balance();

        Person person = new Person("ewka");
        person.showBalance();

    }
}