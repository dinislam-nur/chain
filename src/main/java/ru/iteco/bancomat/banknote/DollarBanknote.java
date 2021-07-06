package ru.iteco.bancomat.banknote;

public class DollarBanknote extends AbstractBanknote {

    public DollarBanknote(Integer value) {
        super(CurrencyType.USD, value);
    }
}
