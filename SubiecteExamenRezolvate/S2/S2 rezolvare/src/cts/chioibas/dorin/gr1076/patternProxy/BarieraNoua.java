package cts.chioibas.dorin.gr1076.patternProxy;

public class BarieraNoua implements IBariera {

    private BarieraVeche barieraVeche;

    public BarieraNoua(BarieraVeche barieraVeche) {
        this.barieraVeche = barieraVeche;
    }

    public BarieraVeche getBarieraVeche() {
        return barieraVeche;
    }

    public void setBarieraVeche(BarieraVeche barieraVeche) {
        this.barieraVeche = barieraVeche;
    }

    @Override
    public void ridica() {
        if (!barieraVeche.isTrenulEsteInZona() || barieraVeche.isaTrecutTrenul()) {
            barieraVeche.ridica();
        } else {
            System.out.println("Bariera nu se poate ridica");
        }
    }

    @Override
    public void coboara() {
        if (barieraVeche.isTrenulEsteInZona() || !barieraVeche.isaTrecutTrenul()) {
            barieraVeche.coboara();
        } else {
            System.out.println("Bariera nu se poate cobori");
        }
    }
}
