package box;

public class OrcBox extends EnemyBox {
	/*====================declaration===========*/
	private String event= "un orc";
	/*=================constructor===================*/
	public OrcBox() {
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
