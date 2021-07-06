package ru.iteco.bancomat;

import ru.iteco.bancomat.banknote.Banknote;
import ru.iteco.bancomat.handlers.BanknoteHandler;
import ru.iteco.bancomat.handlers.CurrencyHandler;
import ru.iteco.bancomat.handlers.dollar.*;
import ru.iteco.bancomat.handlers.euro.*;
import ru.iteco.bancomat.handlers.ruble.*;

public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new FiveEuroHandler(null);
        handler = new TenEuroHandler(handler);
        handler = new FiftyEuroHandler(handler);
        handler = new HundredEuroHandler(handler);
        final CurrencyHandler euroHandler = new BaseEuroHandler(handler, null);

        handler = new FiveDollarHandler(null);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
        final CurrencyHandler dollarHandler = new BaseDollarHandler(handler, euroHandler);

        handler = new HundredRubleHandler(null);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
        handler = new FiveThousandRubleHandler(handler);
        handler = new BaseRubleHandler(handler, dollarHandler);
    }

    public String getDescription(Banknote banknote) {
        return handler.getDescription(banknote);
    }

}
