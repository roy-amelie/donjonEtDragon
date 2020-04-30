package specificitePerso;

public class Spell {
	//constructors
	/**
	 * 
	 */
	public Spell() {
		this.setSpellAttackLevel(spellAttackLevel);
		this.setSpellName(spellName);
	}
	
	// Characteristic spell
		private String spellName;
		private int spellAttackLevel;

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

}
