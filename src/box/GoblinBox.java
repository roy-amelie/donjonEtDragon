package box;

import perso.Personnage;

public class GoblinBox extends EnemyBox {
	/*====================declaration===========*/
	private String eventName= "un gobelin ! perd 1pv";
	/*=================constructor===================*/
	public GoblinBox() {
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
		lifePerso --;
		perso.setLevelOfLife(lifePerso);
	}

	/*======================tostring====================*/
}
