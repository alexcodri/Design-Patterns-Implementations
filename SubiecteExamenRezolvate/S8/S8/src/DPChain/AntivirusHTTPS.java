package DPChain;

public class AntivirusHTTPS extends Antivirus{

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.LINK && !url.contains("https")) {
			System.out.println("Link-ul " + url + " nu este securizat!");
		} else {
			super.getUrmatorulAntivirus().verificaActiuneUser(tip, url);
		}
	}
}

