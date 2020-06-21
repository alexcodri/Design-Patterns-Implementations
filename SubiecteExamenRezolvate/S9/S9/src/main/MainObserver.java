package main;

import DPObserver.GrupMesagerie;
import DPObserver.ITransmitereMesaj;
import DPObserver.Utilizator;

public class MainObserver {

	public static void main(String[] args) {
		ITransmitereMesaj u1 = new Utilizator("George");
		ITransmitereMesaj u2 = new Utilizator("Andrei");
		ITransmitereMesaj u3 = new Utilizator("Mihai");
		ITransmitereMesaj u4 = new Utilizator("Ana");
		
		GrupMesagerie grup1 = new GrupMesagerie("Grup1");
		GrupMesagerie grup2 = new GrupMesagerie("Grup2");
		
		grup1.adaugaObserver(u1);
		grup1.adaugaObserver(u2);
		grup1.adaugaObserver(u3);
		
		grup2.adaugaObserver(u2);
		grup2.adaugaObserver(u4);

		grup1.trimiteNotificare("George", "Neata, ce mai faceti?");
		grup2.trimiteNotificare("Ana", "Salutare tuturor");
		
		grup1.stergeObserver(u2);
		
		grup1.trimiteNotificare("Mihai", "De ce a iesit George?");
	}

}
