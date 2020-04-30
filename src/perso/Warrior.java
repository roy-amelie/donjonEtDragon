package perso;
import specificitePerso.Weapon;

public class Warrior {
	static final String WEAPON_NAME = "tutu";
	static final int WEAPON_FORCE = 5;
	// Characteristic personage
	private String name;
	private String image;
	private int levelOfLife;
	private int attackForce;
	private Weapon weapon;

	// Characteristic shield
	private String shield = "super bouclier";

	/**
	 * WARRIOR CONSTRUCTOR
	 * @param warriorName
	 * @param warriorImage
	 * @param WarriorLevelOfLife
	 * @param warriorAttackForce
	 */
	public Warrior(String warriorName,String warriorImage, int WarriorLevelOfLife,int warriorAttackForce) {
		this.setName(warriorName);
		this.setImage(warriorImage);
		this.setLevelOfLife(WarriorLevelOfLife);
		this.setAttackForce(warriorAttackForce);		
		this.setShield(shield);
		this.weapon = new Weapon(WEAPON_NAME, WEAPON_FORCE);
	}

	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getLevelOfLife() {
		return levelOfLife;
	}

	public void setLevelOfLife(int levelOfLife) {
		this.levelOfLife = levelOfLife;
	}

	public int getAttackForce() {
		return attackForce;
	}

	public void setAttackForce(int attackForce) {
		this.attackForce = attackForce;
	}

}
