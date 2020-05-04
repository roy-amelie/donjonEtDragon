package perso;
import specificitePerso.Spell;

public class Wizard extends Personnage{
	
	static final String PHILTRE_NAME = "super philtre";
	
	private Spell spell;
	private String philtre;

	
	/**
	 * wizard constructor
	 * @param name
	 * @param image
	 * @param levelOfLife
	 * @param attackForce
	 */
	public Wizard(String name, String image ,int levelOfLife, int attackForce) {
		super(name,image,levelOfLife,attackForce);
		this.setPhiltre(PHILTRE_NAME);
		this.spell= new Spell();
	}

	public String getPhiltre() {
		return philtre;
	}

	public void setPhiltre(String philtre) {
		this.philtre = philtre;
	}

	@Override
	public String toString() {
		return "Wizard "+ super.toString()+", spell=" + spell + ", philtre=" + philtre + "]";
	}
	
}
