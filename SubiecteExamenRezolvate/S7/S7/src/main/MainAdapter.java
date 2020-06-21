package main;

import DPAdapter.AdapterPhotoToBitmap;
import DPAdapter.ImagineBitmap;
import DPAdapter.ImaginePhoto;
import DPAdapter.OriginatorImagineBitmap;

public class MainAdapter {
	public static void main(String[] args) {
		OriginatorImagineBitmap bitmap = new OriginatorImagineBitmap(2, 4, "schema1", "format1");
		AdapterPhotoToBitmap adapter = new AdapterPhotoToBitmap(bitmap);
		
		adapter.aplicaFiltruCuloare("verde");
		adapter.resize(180);
		
		System.out.println(adapter.toString());
	}
	
}
