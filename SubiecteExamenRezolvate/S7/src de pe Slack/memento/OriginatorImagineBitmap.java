package memento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OriginatorImagineBitmap extends ImagineBitmap{
	
	public OriginatorImagineBitmap(int latime,int lugime,String schema, String format)
	{
		this.latime=latime;
		this.lungime=lugime;
		this.schemaCulori=schema;
		this.formatDeStocare=format;
		
	}

	@Override
	public void redimensionare(int nouaLatime, int nouaLungime) {
		this.latime=nouaLatime;
		this.lungime=nouaLungime;
		System.out.println("\n Dimensiuni: "+this.latime+", "+this.lungime);
		
	}

	@Override
	public void modificaSchemaCulori(String schemaCulori) {
		this.schemaCulori=schemaCulori;
		System.out.println("\n Schema de culori este: "+this.schemaCulori);
		
	}

	@Override
	public void modificaFormatDeStocare(String formatDeStocare) {
		this.formatDeStocare=formatDeStocare;
		System.out.println("\n Format de stocare: "+this.formatDeStocare);
		
	}

	@Override
	public void afisareImagine() {
		System.out.println("\n LUNGIME: "+this.lungime+" \nLATIME: "+this.latime+
				"\n CULORI: "+this.schemaCulori+" \n FORMAT: "+this.formatDeStocare);
	}
	
	public MementoImagineBitmap salveazaMemo() throws ParseException
	{
		MementoImagineBitmap memo=new MementoImagineBitmap(this.latime,this.lungime,this.schemaCulori,
				this.formatDeStocare);
		
		SimpleDateFormat formatDate=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		memo.setDataSalvare(new Date());
		System.out.println("\n Acest memento s-a salvat la "+formatDate.format(new Date()));
		
		return memo;
	}
	
	public void undoMemo(MementoImagineBitmap memo)
	{
		this.latime=memo.getLatime();
		this.lungime=memo.getLungime();
		this.schemaCulori=memo.getSchemaCulori();
		this.formatDeStocare=memo.getFormatDeStocare();
	}

}
