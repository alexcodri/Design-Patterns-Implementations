package cts.chioibas.dorin.gr1076.patternState;


public class Bariera implements ITrecereCaleFerata{
    private int idBariera;
    private boolean aTrecutTren;
    private boolean seApropieTren;
    private StareBariera stare;
    private long durata;

    public Bariera(int idBariera) {
        this.idBariera = idBariera;
        this.stare = new BarieraRidicata();
        this.durata = 0;
        this.aTrecutTren = false;
        this.seApropieTren = false;
    }

    public int getIdBariera() {
        return idBariera;
    }

    public void setIdBariera(int idBariera) {
        this.idBariera = idBariera;
    }

    public long getDurata() {
        return durata;
    }

    public void setDurata(long durata) {
        this.durata = durata;
    }

    public void setSeApropieTren(boolean seApropieTren) {
       this.seApropieTren = seApropieTren;
    }

    public void setATrecutTren(boolean aTrecutTren) {
    	this.aTrecutTren = aTrecutTren;
    }

	@Override
	public void pornesteAvertizareSonora(long durata) {
		if(stare instanceof BarieraRidicata && seApropieTren) {
			stare = new BarieraAvertizareSonora();
			stare.realizeazaActiune();
			durata += durata;
			if(durata >= 10) {
				stare = new BarieraCoborata();
				stare.realizeazaActiune();
			}
		} else {
			System.out.println("Bariera nu poate porni avertizarea sonora");
		}
	}

	@Override
	public void ridicaBariera() {
		if(aTrecutTren && stare instanceof BarieraCoborata) {
	        this.aTrecutTren = false;
	        this.seApropieTren = false;
	        this.durata = 0;
	        stare = new BarieraRidicata();
	        stare.realizeazaActiune();
		} else {
			System.out.println("Bariera nu poate fi ridicata");
		}
	}

	@Override
	public void coboaraBariera() {
		if(durata >= 10 && stare instanceof BarieraAvertizareSonora) {
			stare = new BarieraCoborata();
			stare.realizeazaActiune();
		} else {
			System.out.println("Bariera nu poate fi coborata");
		}
	}

	@Override
	public boolean seApropieTren() {
		return seApropieTren;
	}

	@Override
	public boolean trenulATrecut() {
		return aTrecutTren;
	}
	
	
}
