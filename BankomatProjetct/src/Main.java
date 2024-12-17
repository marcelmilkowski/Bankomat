import java.sql.SQLOutput;

public class Main extends Login {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Witaj");
        System.out.println("włóż karte");
        System.out.println("Podaj PIN");
        Login login = new Login();
        login.login(3314);
        System.out.println("haslo gra petarda");
        System.out.println("i elo nowy tekst");
        System.out.println("dodalem kolejan linijke i robie pusha");
    }
}