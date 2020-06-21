package memento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class ManagerImaginiBitmap {
	
	private HashMap<Date,MementoImagineBitmap> salvariMemo=new HashMap<>();
	public void addMemo(MementoImagineBitmap memo)
	{
		this.salvariMemo.put(memo.getDataSalvare(), memo);
	}
	
	public MementoImagineBitmap getMemo(Date date)
	{
		return salvariMemo.get(date);
	}

	public void seeAll()
	{
		Collection<MementoImagineBitmap> all=this.salvariMemo.values();
		for(MementoImagineBitmap mm:all)
		{
			mm.afisareMemento();
		}
		
	}
}
