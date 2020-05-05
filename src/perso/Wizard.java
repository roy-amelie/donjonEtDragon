package perso;
import specificitePerso.Spell;

/**
 * 
 * child class of personage
 *
 */
public class Wizard extends Personnage{
	
	static final String PHILTRE_NAME = "super philtre";

	private String labelEquipementAtt = "choisissez un nom pour le sort";
	
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
	public void setEquipementDef(String name) {
		this.setPhiltre(name);	
	}
	
	@Override
	public void setEquipementAtt(String weaponName, int weaponLevel) {
		// TODO Auto-generated method stub
		this.spell.setSpellName(weaponName);
		this.spell.setSpellAttackLevel(weaponLevel);
	}

	@Override
	public String toString() {
		return "Wizard "+ super.toString()+", spell=" + spell + ", philtre=" + philtre + "]";
	}

	@Override
	public String getTypeEquipementAtt() {
		
		return this.getLabelEquipementAtt();
	}

	private String getLabelEquipementAtt() {
		// TODO Auto-generated method stub
		return labelEquipementAtt;
	}

	
	
}
