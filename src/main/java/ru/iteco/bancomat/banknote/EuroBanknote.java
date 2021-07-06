package ru.iteco.bancomat.banknote;

public class EuroBanknote extends AbstractBanknote{

    public EuroBanknote(Integer value) {
        super(CurrencyType.EUR, value);
    }
}
