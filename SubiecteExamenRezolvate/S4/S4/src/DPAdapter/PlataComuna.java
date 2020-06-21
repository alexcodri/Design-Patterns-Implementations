package DPAdapter;

public class PlataComuna extends PlataMetrouSiTramvai implements ModPlata{

	public PlataComuna(String idCard) {
		super(idCard);
	}

	@Override
	public void plateste() {
		super.plataSoftNou();
	}
}
