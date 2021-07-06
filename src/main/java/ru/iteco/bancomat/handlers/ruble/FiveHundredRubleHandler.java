package ru.iteco.bancomat.handlers.ruble;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiveHundredRubleHandler extends BasicBanknoteHandler {

    private static final Integer FIVE_HUNDRED = 500;

    public FiveHundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIVE_HUNDRED;
    }
}
