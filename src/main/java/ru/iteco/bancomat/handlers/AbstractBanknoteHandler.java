package ru.iteco.bancomat.handlers;

import ru.iteco.bancomat.banknote.Banknote;

public abstract class AbstractBanknoteHandler implements BanknoteHandler {

    private static final StringBuilder DESCRIPTION = new StringBuilder();

    private final BanknoteHandler nextHandler;

    protected AbstractBanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Banknote banknote) {
        if (nextHandler != null) {
            nextHandler.handle(banknote);
        } else {
            addDescription(getErrorDescription(banknote));
        }
    }

    @Override
    public String getDescription(Banknote banknote) {
        if (DESCRIPTION.length() == 0) {
            handle(banknote);
        }
        final String result = DESCRIPTION.toString();
        DESCRIPTION.delete(0, DESCRIPTION.length());
        return result;
    }

    protected abstract String getErrorDescription(Banknote banknote);

    protected void addDescription(String value) {
        if (DESCRIPTION.length() != 0) {
            DESCRIPTION.append(" + ");
        }
        DESCRIPTION.append(value);
    }
}
