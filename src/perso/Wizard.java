package perso;
import specificitePerso.Spell;

public class Wizard {

	public String name;
	public String image;
	public int levelOfLife;
	public int attackForce;
	public Spell spell;

	// Characteristic politer
	private String philtre;

	/**
	 * wizard constructor
	 */
	public Wizard() {
		name = "tutu";
		image= "";
		levelOfLife = 5;
		attackForce = 10;
		this.setPhiltre(philtre);
		this.spell= new Spell();
	}

	/**
	 * wizard constructor
	 * @param wizardName
	 */
	public Wizard(String wizardName) {
		name = wizardName;
		image= "";
		levelOfLife = 5;
		attackForce = 10;
		this.setPhiltre(philtre);
		this.spell= new Spell();
	}

	/**
	 * wizard constructor
	 * @param wizardName
	 * @param wizardImage
	 * @param wizardLevelOfLife
	 * @param wizardAttackForce
	 */
	public Wizard(String wizardName, String wizardImage ,int wizardLevelOfLife, int wizardAttackForce) {
		name = wizardName;
		image= wizardImage;
		levelOfLife = wizardLevelOfLife;
		attackForce = wizardAttackForce;
		this.setPhiltre(philtre);
		this.spell= new Spell();
	}

	/**
	 * 
	 * @return philtre
	 */
	public String getPhiltre() {
		return philtre;
	}

	/**
	 * 
	 * @param philtre
	 */
	public void setPhiltre(String philtre) {
		this.philtre = philtre;
	}

}
