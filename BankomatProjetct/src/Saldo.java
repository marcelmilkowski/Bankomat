public class Saldo {

    Marcel marcel = new Marcel();

    void Marcel() {
        System.out.println("Witaj " + marcel.getName());
        System.out.println("Posiadasz " + marcel.getBalance() + "zł");
        if (marcel.credit() == false) {
            System.out.println("Nie posiadasz żadnych kredytów");
        } else {
            System.out.println("Posiadasz kredyt");
        }
    }
}


