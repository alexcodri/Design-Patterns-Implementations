package memento;

public  abstract class ImagineBitmap {

	protected int latime;
	protected int lungime;
	protected String schemaCulori;
	protected String formatDeStocare;
	//adauga inca un atribut la alegere
	
	public abstract void redimensionare(int nouaLatime, int nouaLungime);
	public abstract void modificaSchemaCulori(String schemaCulori);
	
	public abstract void modificaFormatDeStocare(String formatDeStocare);
	
	//adauga inca 2 metode la alegere (poti verifica ce poti face in Paint ca sursa de inspiratie)
	
	public abstract void afisareImagine();
}
