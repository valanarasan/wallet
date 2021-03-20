import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WalletTest {
    @Test
    void shouldReturnTrueIfOneDollarIsEqualToItsInrEquivalent() {
        double dollar=1;
        double rupees=74.85;
        Wallet wallet = new Wallet(rupees,dollar);

        boolean expected=wallet.equivalent();

        assertTrue(expected);

    }

    @Test
    void shouldReturnWalletBalanceInRupeesAsPreferredCurrency() {
        String prefferedCurrency="Rs";
        double dollar=1;
        double rupees=50;
        double actual=124.85;
        Wallet wallet = new Wallet(rupees,dollar,prefferedCurrency);

        double expected=wallet.balanceInPrefferedCurrency();

        assertEquals(expected,actual);

    }

    @Test
    void shouldReturnWalletBalanceInDollarAsPreferredCurrency() {
        String prefferedCurrency="$";
        double dollar=1;
        double rupees1=74.85;
        double rupees2=149.7;
        double rupees=rupees1+rupees2;
        double expected=4;
        Wallet wallet = new Wallet(rupees,dollar,prefferedCurrency);

        double actual=wallet.balanceInPrefferedCurrency();

        assertEquals(expected,actual);


    }

}
