package DPChain;

import java.util.ArrayList;
import java.util.List;

public class AntivirusSafe extends Antivirus{
	private List<ItemIstoric> istoric;

	public AntivirusSafe() {
		istoric = new ArrayList<ItemIstoric>();
	}

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.DOWNLOAD) {
			System.out.println("Fisierul " + url + " a fost download-at cu succes!");
		} else if(tip == TipActiune.LINK){
			System.out.println("Link-ul " + url + " a fost accesat cu succes!");
		}
		istoric.add(new ItemIstoric(tip, url));
	}
	
	public void afiseazaIstoric() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "AntivirusSafe [istoric=" + istoric + "]";
	}
}
