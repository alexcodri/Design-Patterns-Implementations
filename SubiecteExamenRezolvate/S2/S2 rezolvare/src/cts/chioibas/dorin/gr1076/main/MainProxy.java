package cts.chioibas.dorin.gr1076.main;

import cts.chioibas.dorin.gr1076.patternProxy.BarieraNoua;
import cts.chioibas.dorin.gr1076.patternProxy.BarieraVeche;

public class MainProxy {
    public static void main(String[] args) {
        BarieraVeche barieraVeche = new BarieraVeche(true, false);
        barieraVeche.ridica();
        barieraVeche.coboara();

        BarieraNoua barieraNoua = new BarieraNoua(barieraVeche);
        barieraNoua.ridica();
        barieraNoua.coboara();

        barieraNoua.setBarieraVeche(new BarieraVeche(false, true));
        barieraNoua.ridica();
        barieraNoua.coboara();
    }
}
