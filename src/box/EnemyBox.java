package box;

public class EnemyBox extends GameBox{
	/*========================declaration=================*/
	private String event="il y a un ennemi";
	private String name="attention à l'ennemi";
	
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
	String Event() {
		// TODO Auto-generated method stub
		return this.getEvent();
	}

	@Override
	public String toString() {
		return "EnemyBox [ name=" + name + "]";
	}

}
