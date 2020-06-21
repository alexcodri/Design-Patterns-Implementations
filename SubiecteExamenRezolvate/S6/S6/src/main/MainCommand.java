package main;

import DPCommand.ComandaDeLivrat;
import DPCommand.Curier;
import DPCommand.Sistem;

public class MainCommand {
	public static void main(String[] args) {
		Curier c1 = new Curier("Andrei", 4);
		Curier c2 = new Curier("David", 3);
		
		Sistem sistem = new Sistem();
		sistem.preiaComanda(new ComandaDeLivrat("Mircea", "Magazin1", c1));
		sistem.preiaComanda(new ComandaDeLivrat("Vlad", "Magazin2", c2));
		sistem.livreazaComenzi();
		sistem.preiaComanda(new ComandaDeLivrat("Anghel", "Magazin3", c1));
		sistem.livreazaComenzi();
	}

}
