package ru.iteco.bancomat.handlers.euro;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class HundredEuroHandler extends BasicBanknoteHandler {

    private static final Integer HUNDRED = 100;

    public HundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return HUNDRED;
    }
}
