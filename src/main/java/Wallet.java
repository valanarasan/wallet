public class Wallet {
    private double dollar;
    private double rupees;
    private static final double onedollarequivalentinrupees=74.85;
    private String prefferedCurrency;

    public Wallet(double rupees, double dollar, String prefferedCurrency) {
        this.dollar = dollar;
        this.rupees = rupees;
        this.prefferedCurrency= prefferedCurrency;
    }
    public Wallet(double rupees, double dollar) {
        this.dollar = dollar;
        this.rupees = rupees;
    }
    public boolean equivalent() {
        return dollar==(rupees/onedollarequivalentinrupees);
    }
    public double convertDollarToRupees(){
        return dollar * onedollarequivalentinrupees;
    }
    public double convertRupeesToDollar(){
        return rupees/onedollarequivalentinrupees;
    }

    public double balanceInPrefferedCurrency() {
        if(prefferedCurrency == "Rs"){
            return rupees+convertDollarToRupees();
        }
        else{
            double sum=dollar+convertRupeesToDollar();
            return (int) sum;
        }

    }

    public void creditCurrency(double creditRupees, double creditDollar) {
        rupees+=creditRupees;
        dollar+=creditDollar;
    }

    public double getRupees() {
        return rupees;
    }

    public int getDollar() {
        return (int) dollar;
    }
}
