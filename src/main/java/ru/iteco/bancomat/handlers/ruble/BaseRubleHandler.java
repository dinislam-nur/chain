package ru.iteco.bancomat.handlers.ruble;

import ru.iteco.bancomat.banknote.CurrencyType;
import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.CurrencyHandler;

import static ru.iteco.bancomat.banknote.CurrencyType.*;

public class BaseRubleHandler extends CurrencyHandler {

    private final CurrencyType type = RUB;

    public BaseRubleHandler(BanknoteHandler nextBanknoteHandler, CurrencyHandler nextCurrencyHandler) {
        super(nextBanknoteHandler, nextCurrencyHandler);
    }

    @Override
    protected CurrencyType getType() {
        return type;
    }
}
