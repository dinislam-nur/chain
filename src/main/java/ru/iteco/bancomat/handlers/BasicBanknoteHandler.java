package ru.iteco.bancomat.handlers;

import ru.iteco.bancomat.banknote.Banknote;

public abstract class BasicBanknoteHandler extends AbstractBanknoteHandler {

    protected BasicBanknoteHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Banknote banknote) {
        final Integer value = banknote.getValue();
        final Integer fixValue = getFixValue();
        if (value >= fixValue) {
            addDescription(fixValue + "x" + value/fixValue);
        }
        final int mod = value % fixValue;
        if (value != 0 && mod == 0) {
            return;
        }
        banknote.setValue(mod);
        super.handle(banknote);
    }

    protected abstract Integer getFixValue();

    @Override
    protected String getErrorDescription(Banknote banknote) {
        return banknote.getValue() + " невалидная сумма";
    }
}
