package box;

public class GoblinBox extends EnemyBox {
	/*====================declaration===========*/
	private String event= "un gobelin";
	/*=================constructor===================*/
	public GoblinBox() {
		super();
	}
	
	/*==================getter/setter===================*/
	
	
	/*===================method========================*/
	@Override
	public String event() {
		return event;
	}

	/*======================tostring====================*/
}
