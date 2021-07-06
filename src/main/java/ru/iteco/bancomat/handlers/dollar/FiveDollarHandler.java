package ru.iteco.bancomat.handlers.dollar;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiveDollarHandler extends BasicBanknoteHandler {

    private static final Integer FIVE = 5;

    public FiveDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIVE;
    }
}
