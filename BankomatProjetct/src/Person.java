public class Person {


    private String name;
    private double balance;
    private boolean credit;

    Person(String name, double balance, boolean credit){
        this.name = name;
        this.balance = balance;
        this.credit = credit;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public boolean isCredit() {
        return credit;
    }

    void setBalancePayment(double payment){
        this.balance = balance + payment;
        System.out.println("Pomyślnie wpłacono pieniądze");

    }
    void setBalanceWithdraw(double withdraw) {
        if (withdraw < balance) {
            this.balance = balance - withdraw;
            System.out.println("Trwa wypłacanie proszę odebrać pieniądze");
        } else {
            System.out.println("Nie masz takich środków na koncie");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
