package DPChain;

public abstract class MijlocDeTransport {

	private MijlocDeTransport urmatorulMijloc;

	public MijlocDeTransport getUrmatorulMijloc() {
		return urmatorulMijloc;
	}

	public void setUrmatorulMijloc(MijlocDeTransport urmatorulMijloc) {
		this.urmatorulMijloc = urmatorulMijloc;
	}
	
	public abstract void deplaseaza(ICalator calator, int nrKm);
}
