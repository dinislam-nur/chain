package ru.iteco.bancomat.handlers.euro;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class TenEuroHandler extends BasicBanknoteHandler {

    private static final Integer TEN = 10;

    public TenEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return TEN;
    }
}
