package DPDecorator;

public class PluginExecutabile extends Plugin{

	public PluginExecutabile(IAntivirus antivirus) {
		super(antivirus);
	}

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		switch(tip) {
		case DOWNLOAD:
			if(url.contains("virus") || url.contains("malware")) {
				System.out.println("Executabilul " + url + " contine virusi!");
			} else {
				System.out.println("A fost download-at fisierul " + url);
			}
			break;
		case LINK:
			super.antivirus.verificaActiuneUser(tip, url);
			break;
		default:
			System.out.println("Actiune necunoscuta");
		}
	}

}
