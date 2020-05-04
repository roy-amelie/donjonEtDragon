package specificitePerso;

public class Weapon {
	// Characteristic weapon
	private String weaponName = "toto";
	private int weaponAttackLevel= 5;

	//constructor
	public Weapon() {
		this.setWeaponAttackLevel(weaponAttackLevel);
		this.setWeaponName(weaponName);
	};

	@Override
	public String toString() {
		return "[weaponName=" + weaponName + ", weaponAttackLevel=" + weaponAttackLevel + "]";
	}

	/**
	 * 
	 * @return
	 */
	public String getWeaponName() {
		return weaponName;
	}

	/**
	 * 
	 * @param weaponName
	 */
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	/**
	 * 
	 * @return
	 */
	public int getWeaponAttackLevel() {
		return weaponAttackLevel;
	}

	/**
	 * 
	 * @param weaponAttackLevel2
	 */
	public void setWeaponAttackLevel(int weaponAttackLevel2) {
		this.weaponAttackLevel= weaponAttackLevel2;
	}

}
