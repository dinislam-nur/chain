package ru.iteco.bancomat.handlers.dollar;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class HundredDollarHandler extends BasicBanknoteHandler {

    private static final Integer HUNDRED = 100;

    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return HUNDRED;
    }
}
