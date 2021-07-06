package ru.iteco.bancomat.handlers;

import ru.iteco.bancomat.banknote.Banknote;

public interface BanknoteHandler {

    void handle(Banknote banknote);

    String getDescription(Banknote banknote);

}
