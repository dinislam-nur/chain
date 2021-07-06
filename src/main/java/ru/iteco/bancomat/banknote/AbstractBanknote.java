package ru.iteco.bancomat.banknote;

public abstract class AbstractBanknote implements Banknote {

    protected CurrencyType currency;
    protected Integer value;

    public AbstractBanknote(CurrencyType currency, Integer value) {
        this.currency = currency;
        this.value = value;
    }

    @Override
    public CurrencyType getCurrency() {
        return currency;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }
}
