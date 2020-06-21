package DPMemento;

import java.util.Date;

public class OriginatorImaginePhoto extends ImagineBitmap{
	
	public OriginatorImaginePhoto(int latime,int lugime,String schema, String format)
	{
		this.latime=latime;
		this.lungime=lugime;
		this.schemaCulori=schema;
		this.formatDeStocare=format;
	}

	@Override
	public void redimensionare(int nouaLatime, int nouaLungime) {
		this.latime = nouaLatime;
		this.lungime = nouaLungime;
		System.out.println("Dimensiuni: " + this.latime + ", " + this.lungime);
	}

	@Override
	public void modificaSchemaCulori(String schemaCulori) {
		this.schemaCulori = schemaCulori;
		System.out.println("Schema de culori este: " + this.schemaCulori);
	}

	@Override
	public void modificaFormatDeStocare(String formatDeStocare) {
		this.formatDeStocare=formatDeStocare;
		System.out.println("Format de stocare: " + this.formatDeStocare);		
	}

	@Override
	public void salveazaImagine(String formatDeStocare) {
		System.out.println("Imaginea a fost salvata sub formatul " + formatDeStocare);
	}

	@Override
	public void afisareImagine() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "OriginatorImaginePhoto [latime=" + latime + ", lungime=" + lungime + ", schemaCulori=" + schemaCulori
				+ ", formatDeStocare=" + formatDeStocare + "]";
	}
	
	public MementoImagineBitmap salvareMemento() {
		return new MementoImagineBitmap(latime, lungime, schemaCulori, formatDeStocare, new Date());
	}
	
	public void undoMemento(MementoImagineBitmap memento) {
		latime = memento.getLatime();
		lungime = memento.getLungime();
		schemaCulori = memento.getSchemaCulori();
		formatDeStocare = memento.getFormatDeStocare();
	}

}