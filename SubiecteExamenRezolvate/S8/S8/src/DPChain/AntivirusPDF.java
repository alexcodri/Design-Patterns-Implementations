package DPChain;

public class AntivirusPDF extends Antivirus{

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.DOWNLOAD && url.contains(".pdf") && url.contains("malware")) {
			System.out.println("PDF-ul pe care incercati sa il downloadati contine malware!");
		} else {
			super.getUrmatorulAntivirus().verificaActiuneUser(tip, url);
		}
	}
}

