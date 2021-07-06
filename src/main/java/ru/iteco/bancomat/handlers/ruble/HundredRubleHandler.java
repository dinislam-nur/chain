package ru.iteco.bancomat.handlers.ruble;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class HundredRubleHandler extends BasicBanknoteHandler {

    private static final Integer HUNDRED = 100;

    public HundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return HUNDRED;
    }
}
