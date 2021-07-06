package ru.iteco.bancomat.handlers.ruble;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiveThousandRubleHandler extends BasicBanknoteHandler {

    private static final int FIVE_THOUSAND = 5000;

    public FiveThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIVE_THOUSAND;
    }
}
