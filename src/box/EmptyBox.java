package box;

public class EmptyBox extends GameBox {
	/* ==============Declaration============*/
	private String event = "cette case est vide";
	private String name = "cette case est vide" ;
	
	/* ==============Constructor============*/
	public EmptyBox() {
		super();
	}
	
	/* ==============getter/setter============*/
	public String getEvent() {
		return event;
	}
	/* ==============parent method============*/
	@Override
	public String event() {
		return event;
	}

	@Override
	public String toString() {
		return "EmptyBox [name=" + name + "]";
	}
	

}
