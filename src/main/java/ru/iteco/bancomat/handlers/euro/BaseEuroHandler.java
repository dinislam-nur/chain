package ru.iteco.bancomat.handlers.euro;

import ru.iteco.bancomat.banknote.CurrencyType;
import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.CurrencyHandler;

import static ru.iteco.bancomat.banknote.CurrencyType.*;

public class BaseEuroHandler extends CurrencyHandler {

    private static final CurrencyType EURO = EUR;

    public BaseEuroHandler(BanknoteHandler nextBanknoteHandler, CurrencyHandler nextCurrencyHandler) {
        super(nextBanknoteHandler, nextCurrencyHandler);
    }

    @Override
    protected CurrencyType getType() {
        return EURO;
    }
}
