package memento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestMemento {
	
	public static void main(String[] args)
	{
		OriginatorImagineBitmap imagine=new OriginatorImagineBitmap(10,20,"RGB","JPG");
		ManagerImaginiBitmap manager=new ManagerImaginiBitmap();
		try
		{
	        manager.addMemo(imagine.salveazaMemo());
	        Date dataInitiala=imagine.salveazaMemo().getDataSalvare();
			
			imagine.redimensionare(15,200);
			manager.addMemo(imagine.salveazaMemo());
			imagine.afisareImagine();
			
			TimeUnit.SECONDS.sleep(5);
			
			imagine.modificaFormatDeStocare("PNG");
			manager.addMemo(imagine.salveazaMemo());
			imagine.afisareImagine();
			
			TimeUnit.SECONDS.sleep(5);
			
			imagine.modificaSchemaCulori("#0000");
			manager.addMemo(imagine.salveazaMemo());
			imagine.afisareImagine();
			
			System.out.println("===========");
			manager.getMemo(dataInitiala).afisareMemento();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		
		
		
	}

}
