public class Wallet {
    private final double dollar;
    private final double rupees;
    private final double onedollarequivalentinrupees=74.85;
    private String prefferedCurrency;

    public Wallet(double rupees, double dollar,String prefferedCurrency) {
        this.dollar = dollar;
        this.rupees = rupees;
        this.prefferedCurrency=prefferedCurrency;
    }

    public Wallet(double rupees, double dollar) {
        this.dollar = dollar;
        this.rupees = rupees;
    }

    public boolean equivalent() {
        return dollar==(rupees/onedollarequivalentinrupees);
    }
    public double convertDollarToRupees(){
        return dollar*onedollarequivalentinrupees;
    }
    public double convertRupeesToDollar(){
        return rupees/onedollarequivalentinrupees;
    }

    public double balanceInPrefferedCurrency() {
        if(prefferedCurrency=="Rs"){
            double sum=rupees+convertDollarToRupees();
            return sum;
        }
        else{
            double sum=dollar+convertRupeesToDollar();
            return (int) sum;
        }

    }
}
