package by.itstep.gulik.controller;

import by.itstep.gulik.model.data.Dragon;
import by.itstep.gulik.model.logic.DragonLogic;
import by.itstep.gulik.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        Dragon garinich = new Dragon();
        garinich.age = 120;
        garinich.name = "Garinich";

        Dragon pushok = new Dragon();
        pushok.name = "Pushok";
        pushok.age = 350;

        int head = DragonLogic.calculateHeads(garinich);
        String msg = String.format("Garinich has %d heads\n", head);
        Printer.print(msg);

        head = DragonLogic.calculateHeads(pushok);
        msg = String.format("Pushok has %d heads\n", head);
        Printer.print(msg);
    }
}
