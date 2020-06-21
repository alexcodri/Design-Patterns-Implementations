package DPChain;

public class ItemIstoric {
	private TipActiune tip;
	private String url;
	public ItemIstoric(TipActiune tip, String url) {
		super();
		this.tip = tip;
		this.url = url;
	}
	@Override
	public String toString() {
		return "ItemIstoric [tip=" + tip + ", url=" + url + "]";
	}
}
