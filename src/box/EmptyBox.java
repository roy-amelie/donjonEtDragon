package box;

import perso.Personnage;

public class EmptyBox extends GameBox {
	/* ==============Declaration============*/
	private String eventName = "cette case est vide";
	private String name = "cette case est vide" ;
	
	/* ==============Constructor============*/
	public EmptyBox() {
		super();
	}
	
	/* ==============getter/setter============*/
	public String getEventName() {
		return eventName;
	}
	/* ==============parent method============*/
	@Override
	public void event(Personnage perso) {
		
	}

	@Override
	public String toString() {
		return "EmptyBox [name=" + name + "]";
	}
	

}
