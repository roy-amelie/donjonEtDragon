package perso;
import specificitePerso.Weapon;

/**
 * child class of personage
 * 
 *
 */
public class Warrior extends Personnage {
	
	static final String SHIELD_NAME = "super bouclier";
	// Characteristic personage
	private Weapon weapon;
	private String shield;
	private String labelEquipementAtt= "choisissez un mon pour l'arme";
	
	/**
	 * WARRIOR CONSTRUCTOR
	 * @param warriorName
	 * @param warriorImage
	 * @param WarriorLevelOfLife
	 * @param warriorAttackForce
	 */
	public Warrior(String name,String image,int levelOfLife,int attackForce) {		
		super(name, image, levelOfLife, attackForce);
		this.setShield(SHIELD_NAME);
		this.weapon = new Weapon();
	}
	
	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}
	
	@Override
	public void setEquipementDef(String Shield) {
		this.setShield(shield);
		
	}

	@Override
	public void setEquipementAtt(String weaponName, int weaponLevel) {
		this.weapon.setWeaponName(weaponName);
		this.weapon.setWeaponAttackLevel(weaponLevel);
	}

	@Override
	public String getTypeEquipementAtt() {
		return this.getLabelEquipementAtt();
	}

	public String getLabelEquipementAtt() {
		return labelEquipementAtt;
	}

	public void setLabelEquipementAtt(String labelEquipementAtt) {
		this.labelEquipementAtt = labelEquipementAtt;
	}
	
	@Override
	public String toString() {
		return "Warrior " +super.toString()+ ", weapon=" + weapon + ", shield=" + shield + "]";
	}
	
}
