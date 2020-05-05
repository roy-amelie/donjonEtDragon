package perso;
public abstract class Personnage {
	
	protected String name;
	protected String image;
	protected int levelOfLife;
	protected int attackForce;
	
	public Personnage(String name, String image, int levelOfLife, int attackForce) {
		this.setName(name);
		this.setImage(image);
		this.setLevelOfLife(levelOfLife);
		this.setAttackForce(attackForce);	
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
	
	abstract void setEquipementDef(String name);
	
	@Override
	public String toString() {
		return "[name=" + name + ", image=" + image + ", levelOfLife=" + levelOfLife + ", attackForce="
				+ attackForce + "]";
	}

	public void setAttackForce(int attackForce) {
		this.attackForce = attackForce;
	}

	void setEquipementAtt(String weaponName, int weaponLevel) {
		// TODO Auto-generated method stub
		
	}
}

