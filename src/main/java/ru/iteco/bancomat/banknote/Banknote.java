package ru.iteco.bancomat.banknote;

public interface Banknote {

    CurrencyType getCurrency();

    Integer getValue();

    void setValue(Integer value);
}
