package box;

public abstract class GameBox {

	/* ==============declarations============*/
	protected String name;

	/* ==============Constructor============*/
	public GameBox() {
		this.setName(name);
	}

	/* ==============getter/setter============*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* ==============method============*/
	public abstract String event();



	/*===================toString==================*/
	@Override
	public String toString() {
		return "GameBox [name=" + name + "]";
	}
}
