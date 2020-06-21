package DPChain;

public abstract class Antivirus implements IAntivirus{
	private Antivirus urmatorulAntivirus;
	
	public Antivirus getUrmatorulAntivirus() {
		return urmatorulAntivirus;
	}

	public void setUrmatorulAntivirus(Antivirus urmatorulAntivirus) {
		this.urmatorulAntivirus = urmatorulAntivirus;
	}
}
