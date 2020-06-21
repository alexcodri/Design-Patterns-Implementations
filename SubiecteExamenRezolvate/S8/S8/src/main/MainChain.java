package main;

import DPChain.Antivirus;
import DPChain.AntivirusExecutabil;
import DPChain.AntivirusHTTPS;
import DPChain.AntivirusPDF;
import DPChain.AntivirusSafe;
import DPChain.TipActiune;

public class MainChain {
	public static void main(String[] args) {
		Antivirus antivirusExecutabil = new AntivirusExecutabil();
		Antivirus antivirusPDF = new AntivirusPDF();
		Antivirus antivirusHTTPS = new AntivirusHTTPS();
		Antivirus antivirusSafe = new AntivirusSafe();
		
		antivirusExecutabil.setUrmatorulAntivirus(antivirusPDF);
		antivirusPDF.setUrmatorulAntivirus(antivirusHTTPS);
		antivirusHTTPS.setUrmatorulAntivirus(antivirusSafe);
		
		antivirusExecutabil.verificaActiuneUser(TipActiune.DOWNLOAD, "virus.exe");
		antivirusExecutabil.verificaActiuneUser(TipActiune.DOWNLOAD, "safeExam.exe");
		antivirusExecutabil.verificaActiuneUser(TipActiune.DOWNLOAD, "malware.pdf");
		antivirusExecutabil.verificaActiuneUser(TipActiune.DOWNLOAD, "safeExam.pdf");
		antivirusExecutabil.verificaActiuneUser(TipActiune.LINK, "http://notSafeExamn.com");
		antivirusExecutabil.verificaActiuneUser(TipActiune.LINK, "https://safeExamn.com");
		
		((AntivirusSafe) antivirusSafe).afiseazaIstoric();
	}
}
