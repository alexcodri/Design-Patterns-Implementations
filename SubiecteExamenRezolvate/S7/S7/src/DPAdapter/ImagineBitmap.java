package DPAdapter;


public abstract class ImagineBitmap {
	protected int latime;
	protected int lungime;
	protected String schemaCulori;
	protected String formatDeStocare;
	
	public abstract void redimensionare(int nouaLatime, int nouaLungime);
	public abstract void modificaSchemaCulori(String schemaCulori);
	public abstract void modificaFormatDeStocare(String formatDeStocare);
	public abstract void salveazaImagine(String formatDeStocare);
	public abstract void afisareImagine();
}
