package box;

import perso.Personnage;

public class TreasureBox extends BonusBox {

	private String eventName = "un tresor ! recupere 1pv";

	/*=================constructor===================*/
	public TreasureBox() {
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
		lifePerso ++;
		perso.setLevelOfLife(lifePerso);
	}

}
