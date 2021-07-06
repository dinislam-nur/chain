package ru.iteco.bancomat.handlers.dollar;

import ru.iteco.bancomat.banknote.CurrencyType;
import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.CurrencyHandler;

public class BaseDollarHandler extends CurrencyHandler {

    private static final CurrencyType DOLLAR = CurrencyType.USD;

    public BaseDollarHandler(BanknoteHandler nextBanknoteHandler, CurrencyHandler nextCurrencyHandler) {
        super(nextBanknoteHandler, nextCurrencyHandler);
    }

    @Override
    protected CurrencyType getType() {
        return DOLLAR;
    }
}
