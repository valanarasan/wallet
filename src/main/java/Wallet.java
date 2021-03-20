public class Wallet {
    private final double dollar;
    private final double rupees;
    private final double onedollarequivalentinrupees=74.85;

    public Wallet(double rupees, double dollar) {
        this.rupees=rupees;
        this.dollar=dollar;
    }

    public boolean equivalent() {
        return dollar==(rupees/onedollarequivalentinrupees);
    }
}
