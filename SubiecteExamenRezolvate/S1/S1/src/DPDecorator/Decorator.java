package DPDecorator;

public abstract class Decorator implements IActiuniEmail{
	protected IActiuniEmail client;

	public Decorator(IActiuniEmail client) {
		super();
		this.client = client;
	}
}
