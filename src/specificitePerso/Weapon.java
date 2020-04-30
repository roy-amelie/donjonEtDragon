package specificitePerso;

public class Weapon {
	// Characteristic weapon
	private String weaponName;
	private int weaponAttackLevel;

	//constructor
	public Weapon(String weaponName2, int weaponForce) {
		this.weaponAttackLevel = weaponForce;
		this.weaponName = weaponName2;
	};

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
	 * @param weaponAttackLeve
	 */
	public void setWeaponAttackLeve(int weaponAttackLeve) {
		this.weaponAttackLevel= weaponAttackLeve;
	}

}
