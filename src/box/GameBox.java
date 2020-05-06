package box;

import perso.Personnage;

public abstract class GameBox {

	/* ==============declarations============*/
	protected String name;

	/* ==============Constructor============*/
	public GameBox() {
		this.setEventName(name);
	}

	/* ==============getter/setter============*/
	public String getEventName() {
		return name;
	}

	public void setEventName(String name) {
		this.name = name;
	}

	/* ==============method============*/
	public abstract void event(Personnage perso);

	/*===================toString==================*/
	@Override
	public String toString() {
		return "GameBox [name=" + name + "]";
	}
}
