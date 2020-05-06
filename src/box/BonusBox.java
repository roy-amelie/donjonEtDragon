package box;

public class BonusBox extends GameBox{
	/*========================declaration=================*/
	private String event = "Bonus";
	

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
	public String Event() {
		return this.getEvent();
	}
	
	@Override
	public String toString() {
		return "BonusBox [name=" + name + "]";
	}
}
