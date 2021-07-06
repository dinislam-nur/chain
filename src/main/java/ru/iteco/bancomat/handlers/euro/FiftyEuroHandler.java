package ru.iteco.bancomat.handlers.euro;

import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.BasicBanknoteHandler;

public class FiftyEuroHandler extends BasicBanknoteHandler {

    private static final Integer FIFTY = 50;

    public FiftyEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected Integer getFixValue() {
        return FIFTY;
    }
}
