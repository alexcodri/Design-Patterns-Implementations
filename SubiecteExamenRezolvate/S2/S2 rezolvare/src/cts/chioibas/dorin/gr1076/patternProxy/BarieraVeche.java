package cts.chioibas.dorin.gr1076.patternProxy;

public class BarieraVeche implements IBariera {

    private boolean aTrecutTrenul;
    private boolean trenulEsteInZona;

    public BarieraVeche(boolean aTrecutTrenul, boolean trenulEsteInZona) {
        this.aTrecutTrenul = aTrecutTrenul;
        this.trenulEsteInZona = trenulEsteInZona;
    }

    public boolean isaTrecutTrenul() {
        return aTrecutTrenul;
    }

    public void setaTrecutTrenul(boolean aTrecutTrenul) {
        this.aTrecutTrenul = aTrecutTrenul;
    }

    public boolean isTrenulEsteInZona() {
        return trenulEsteInZona;
    }

    public void setTrenulEsteInZona(boolean trenulEsteInZona) {
        this.trenulEsteInZona = trenulEsteInZona;
    }

    @Override
    public void ridica() {
        System.out.println("Bariera se ridica");
    }

    @Override
    public void coboara() {
        System.out.println("Bariera se coboara");
    }
}
