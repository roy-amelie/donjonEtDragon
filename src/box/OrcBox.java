package box;

import perso.Personnage;

public class OrcBox extends EnemyBox {
	/*====================declaration===========*/
	private String eventName= "un orc ! perd 3pv";
	/*=================constructor===================*/
	public OrcBox() {
		super();
	}
	
	/*==================getter/setter===================*/
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/*===================method========================*/
	@Override
	public void event(Personnage perso) {
		int lifePerso = perso.getLevelOfLife();
		lifePerso -= 3;
		perso.setLevelOfLife(lifePerso);
	}

	/*======================tostring====================*/
}
