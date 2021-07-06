package ru.iteco.bancomat.handlers.dollar;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiftyDollarHandler extends BasicBanknoteHandler {

    private static final Integer FIFTY = 50;

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIFTY;
    }
}
