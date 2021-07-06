package ru.iteco.bancomat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.iteco.bancomat.banknote.Banknote;
import ru.iteco.bancomat.banknote.DollarBanknote;
import ru.iteco.bancomat.banknote.EuroBanknote;
import ru.iteco.bancomat.banknote.RubleBanknote;

import static org.junit.jupiter.api.Assertions.*;

class BancomatTest {

    private static Bancomat bancomat;

    @BeforeAll
    static void beforeAll() {
        bancomat = new Bancomat();
    }

    @Test
    public void rublePositiveTest() {
        banknoteTest(new RubleBanknote(900), "500x1 + 100x4");

        banknoteTest(new RubleBanknote(6600), "5000x1 + 1000x1 + 500x1 + 100x1");
    }

    @Test
    public void rubleNegativeTest() {
        banknoteTest(new RubleBanknote(0), "0 невалидная сумма");

        banknoteTest(new RubleBanknote(12432), "5000x2 + 1000x2 + 100x4 + 32 невалидная сумма");
    }

    @Test
    public void dollarPositiveTest() {
        banknoteTest(new DollarBanknote(345), "100x3 + 10x4 + 5x1");
    }

    @Test
    public void dollarNegativeTest() {
        banknoteTest(new DollarBanknote(0), "0 невалидная сумма");

        banknoteTest(new DollarBanknote(123), "100x1 + 10x2 + 3 невалидная сумма");
    }

    @Test
    public void euroPositiveTest() {
        banknoteTest(new EuroBanknote(375), "100x3 + 50x1 + 10x2 + 5x1");
    }

    @Test
    public void euroNegativeTest() {
        banknoteTest(new EuroBanknote(0), "0 невалидная сумма");

        banknoteTest(new EuroBanknote(421), "100x4 + 10x2 + 1 невалидная сумма");
    }

    private void banknoteTest(Banknote banknote, String expected) {
        final String result = bancomat.getDescription(banknote);
        assertEquals(expected, result);
    }
}