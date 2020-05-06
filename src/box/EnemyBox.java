package box;

import perso.Personnage;

public abstract class EnemyBox extends GameBox{
	/*========================declaration=================*/
	private String event;
	private String eventName;
	
	/*========================constructor=================*/
	public EnemyBox() {
		super();
	}
	
	/*========================getter/setter=================*/
	public String getEvent() {
		return event;
	}

	/*========================method=================*/
	@Override
	public abstract void event(Personnage perso) ;

	@Override
	public String toString() {
		return "EnemyBox [name=" + name + "]";
	}

}
