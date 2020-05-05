package specificitePerso;


public class Spell {
	// Characteristic spell
	private String spellName= "tutu";
	private int spellAttackLevel = 5;

	//constructors
	/**
	 * 
	 */
	public Spell() {
		this.setSpellAttackLevel(spellAttackLevel);
		this.setSpellName(spellName);
	}

	/**
	 * 
	 * @return
	 */
	public String getSpellName() {
		return spellName;
	}

	/**
	 * 
	 * @param spellName
	 */
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	/**
	 * 
	 * @return
	 */
	public int getSpellAttackLevel() {
		return spellAttackLevel;
	}

	/**
	 * 
	 * @param spellAttackLevel
	 */
	public void setSpellAttackLevel(int spellAttackLevel) {
		this.spellAttackLevel = spellAttackLevel;
	}

	@Override
	public String toString() {
		return "[spellName=" + spellName + ", spellAttackLevel=" + spellAttackLevel + "]";
	}

}
