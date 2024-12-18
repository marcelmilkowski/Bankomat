public class Marcel implements Person{
    @Override
    public String getName() {
        return "Marcel";
    }

    @Override
    public int codePIN() {
        return 1234;
    }

    @Override
    public double getBalance() {
        return 350.000;
    }

    @Override
    public boolean credit() {
        return false;
    }
}
