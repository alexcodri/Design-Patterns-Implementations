package DPDecorator;

public abstract class Plugin implements IAntivirus{
	IAntivirus antivirus;

	public Plugin(IAntivirus antivirus) {
		super();
		this.antivirus = antivirus;
	}
}
