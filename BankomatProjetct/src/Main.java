

public class Main  extends Operations{
    public static void main(String[] args) {
        Operations operations = new Operations();


        System.out.println("Witaj");
        System.out.println("włóż karte");
        System.out.println("Podaj PIN");

        operations.login(); //LOGOWANIE
        System.out.println("=== WITAMY W BANKU " + Osoby.get(operations.codePIN).getName().toUpperCase()+ " ===");

        //wybor operacji w bankomacie
        operations.CheckingOperation();

        }


    }
