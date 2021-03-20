import org.junit.jupiter.api.Test;

import java.awt.*;

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

}
