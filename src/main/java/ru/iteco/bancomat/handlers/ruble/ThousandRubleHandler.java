package ru.iteco.bancomat.handlers.ruble;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class ThousandRubleHandler extends BasicBanknoteHandler {

    private static final Integer THOUSAND = 1000;

    public ThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return THOUSAND;
    }
}
