package ru.iteco.bancomat.banknote;

public class RubleBanknote extends AbstractBanknote{

    public RubleBanknote(Integer value) {
        super(CurrencyType.RUB, value);
    }
}
