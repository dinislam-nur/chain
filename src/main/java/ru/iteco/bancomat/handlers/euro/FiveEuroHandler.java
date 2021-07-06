package ru.iteco.bancomat.handlers.euro;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiveEuroHandler extends BasicBanknoteHandler {

    private static final Integer FIVE = 5;

    public FiveEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIVE;
    }
}
