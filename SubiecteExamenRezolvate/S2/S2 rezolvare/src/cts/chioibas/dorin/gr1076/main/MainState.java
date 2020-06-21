package cts.chioibas.dorin.gr1076.main;

import cts.chioibas.dorin.gr1076.patternState.Bariera;

public class MainState {
    public static void main(String[] args) {

        Bariera b1 = new Bariera(5);
        b1.setSeApropieTren(true);
        b1.coboaraBariera();
        b1.pornesteAvertizareSonora(11);
        b1.setATrecutTren(true);
        b1.ridicaBariera();

    }
}
