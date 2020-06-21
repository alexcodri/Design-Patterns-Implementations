package main;

import DPAdapter.ModPlata;
import DPAdapter.PlataAutobuz;
import DPAdapter.PlataComuna;

public class MainAdapter {

	public static void main(String[] args) {
		ModPlata autobuz = new PlataAutobuz();
		ModPlata plataComuna = new PlataComuna("3");
		autobuz.plateste();
		plataComuna.plateste();
	}

}
