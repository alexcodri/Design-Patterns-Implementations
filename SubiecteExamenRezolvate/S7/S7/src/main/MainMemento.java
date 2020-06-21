package main;

import DPMemento.ImagineBitmap;
import DPMemento.ManagerMemento;
import DPMemento.MementoImagineBitmap;
import DPMemento.OriginatorImaginePhoto;

public class MainMemento {

	public static void main(String[] args) {
		ImagineBitmap imagine = new OriginatorImaginePhoto(2, 3, "schema1", "format1");
		
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(((OriginatorImaginePhoto)imagine).salvareMemento());
		imagine.modificaSchemaCulori("schemaaaa2");
		manager.adaugaMemento(((OriginatorImaginePhoto)imagine).salvareMemento());
		imagine.modificaFormatDeStocare("format 222");
		manager.adaugaMemento(((OriginatorImaginePhoto)imagine).salvareMemento());
		imagine.redimensionare(13, 2);
		manager.adaugaMemento(((OriginatorImaginePhoto)imagine).salvareMemento());
		
		manager.seeAll();
		((OriginatorImaginePhoto)imagine).undoMemento(manager.getFirstMemento());
		System.out.println(imagine.toString());
	}

}
