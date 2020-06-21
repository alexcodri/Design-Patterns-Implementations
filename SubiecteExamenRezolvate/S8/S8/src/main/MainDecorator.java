package main;

import DPDecorator.TipActiune;
import DPDecorator.Antivirus;
import DPDecorator.IAntivirus;
import DPDecorator.Plugin;
import DPDecorator.PluginExecutabile;

public class MainDecorator {

	public static void main(String[] args) {
		IAntivirus antivirus = new Antivirus(1234, true);
		antivirus.verificaActiuneUser(TipActiune.LINK, "http://notSafeExam.com");
		antivirus.verificaActiuneUser(TipActiune.LINK, "https://safeExam.com");
		
		Plugin plugin = new PluginExecutabile(antivirus);
		plugin.verificaActiuneUser(TipActiune.LINK, "https://safeExam.com");
		plugin.verificaActiuneUser(TipActiune.DOWNLOAD, "malware.pdf");
		plugin.verificaActiuneUser(TipActiune.DOWNLOAD, "safe.exe");
	}

}
