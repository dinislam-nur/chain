package ru.iteco.bancomat.handlers.dollar;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class TenDollarHandler extends BasicBanknoteHandler {

    private static final Integer TEN = 10;

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return TEN;
    }
}
