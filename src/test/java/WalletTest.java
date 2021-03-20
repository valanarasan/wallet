import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        double expected=124.85;
        Wallet wallet = new Wallet(rupees,dollar,prefferedCurrency);

        double actual=wallet.balanceInPrefferedCurrency();
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

    @Test
    void shouldCreditMoneyInWallet() {
        double dollar=1;
        double rupees=74.85;
        double creditRupees=149.7;
        double creditDollar=4;
        double expectedRupees=rupees+creditRupees;
        double expectedDollar=5;
        Wallet wallet = new Wallet(rupees,dollar);

        wallet.creditCurrency(creditRupees,creditDollar);

        assertAll(()->assertEquals(expectedRupees,wallet.getRupees()),
                ()-> assertEquals(expectedDollar,wallet.getDollar()));
    }

    @Test
    void shouldDebitMoneyFromWallet() {
        double dollar=5;
        double rupees=149.7;
        double debitRupees=74.85;
        double debitDollar=4;
        double expectedRupees=74.85;
        double expectedDollar=1;
        Wallet wallet = new Wallet(rupees,dollar);

        wallet.debitCurrency(debitRupees,debitDollar);

        assertAll(()->assertEquals(expectedRupees,wallet.getRupees()),
                ()-> assertEquals(expectedDollar,wallet.getDollar()));

    }
}
