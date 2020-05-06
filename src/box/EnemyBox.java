package box;

public abstract class EnemyBox extends GameBox{
	/*========================declaration=================*/
	private String event;
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
	public abstract String event() ;

	@Override
	public String toString() {
		return "EnemyBox [name=" + name + "]";
	}

}
