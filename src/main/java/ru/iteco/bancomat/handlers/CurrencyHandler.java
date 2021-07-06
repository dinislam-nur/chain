package ru.iteco.bancomat.handlers;

import ru.iteco.bancomat.banknote.Banknote;
import ru.iteco.bancomat.banknote.CurrencyType;

public abstract class CurrencyHandler extends AbstractBanknoteHandler {

    private final BanknoteHandler nextBanknoteHandler;

    protected CurrencyHandler(BanknoteHandler nextBanknoteHandler, CurrencyHandler nextCurrencyHandler) {
        super(nextCurrencyHandler);
        this.nextBanknoteHandler = nextBanknoteHandler;
    }

    @Override
    public void handle(Banknote banknote) {
        if (getType() == banknote.getCurrency()) {
            nextBanknoteHandler.handle(banknote);
        } else {
            super.handle(banknote);
        }
    }

    @Override
    protected String getErrorDescription(Banknote banknote) {
        return "невалидная валюта";
    }

    protected abstract CurrencyType getType();
}
