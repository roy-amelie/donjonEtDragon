package box;

import perso.Personnage;

public class SuperTreasureBox extends BonusBox {
	/*====================declaration===========*/
	private String eventName= "un super tresor ! recupere 3pv";
	/*=================constructor===================*/
	public SuperTreasureBox() {
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
		lifePerso += 3;
		perso.setLevelOfLife(lifePerso);
	}

	/*======================tostring====================*/
}
