package main;

import DPProxy.Client;
import DPProxy.ProcesareComanda;
import DPProxy.ProxyProcesareComenzi;

public class MainProxy {

	public static void main(String[] args) {
		Client c1 = new Client("client1", 20);
		Client c2 = new Client("client2", 45);
		
		ProcesareComanda com1 = new ProcesareComanda(c1);
		com1.procesareComanda("detalii1", 8, 70.1f);
		ProcesareComanda com2 = new ProcesareComanda(c2);
		com2.procesareComanda("detalii2", 3, 31.1f);
		
		ProxyProcesareComenzi com3 = new ProxyProcesareComenzi(c1);
		ProxyProcesareComenzi com4 = new ProxyProcesareComenzi(c2);
		com3.procesareComanda("detalii3", 2, 31.1f);
		com4.procesareComanda("detalii4", 12, 124.1f);
	}

}
