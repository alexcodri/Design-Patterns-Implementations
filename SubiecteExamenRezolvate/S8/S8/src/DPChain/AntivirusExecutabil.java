package DPChain;

public class AntivirusExecutabil extends Antivirus{

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.DOWNLOAD && url.contains(".exe") && url.contains("virus")) {
			System.out.println("Executabilul pe care incercati sa il downloadati contine virusi!");
		} else {
			super.getUrmatorulAntivirus().verificaActiuneUser(tip, url);
		}
	}
}
