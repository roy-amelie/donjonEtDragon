package box;

import perso.Personnage;

public abstract class BonusBox extends GameBox{
	/*========================declaration=================*/
	private String eventname;
	private String event;
	

	private String name = "cette case est un bonus" ;
	/*========================Constructor====================*/
	public BonusBox(){
		super();
	}
	
	/*========================getter/setter====================*/
	public String getEvent() {
		return event;
	}

	/*========================method====================*/
	@Override
	public abstract void event(Personnage perso);
	
	@Override
	public String toString() {
		return "BonusBox [name=" + name + "]";
	}
}
