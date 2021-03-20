import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WalletTest {
    @Test
    void ReturnTrueIfOneDollarIsEqualToItsInrEquivalent() {
        double dollar=1;
        double rupees=74.85;
        Wallet wallet = new Wallet(rupees,dollar);

        boolean expected=wallet.equivalent();

        assertTrue(expected);

    }

    @Test
    void ReturnWalletBalanceInRupeesAsPreferredCurrency() {
       String prefferedCurrency="Rs";
        double dollar=1;
        double rupees=50;
        double actual=124.85;
        Wallet wallet = new Wallet(rupees,dollar,prefferedCurrency);

        double expected=wallet.balanceInPrefferedCurrency();

        assertEquals(expected,actual);

    }
}
