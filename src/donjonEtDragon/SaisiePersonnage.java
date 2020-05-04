package donjonEtDragon;

import java.util.ArrayList;
import java.util.Scanner;

import perso.Personnage;
import perso.Warrior;
import perso.Wizard;

/**
 * class for create perso
 * 
 *
 */
public class SaisiePersonnage {
	static final String GUERRIER="guerrier";
	static final String MAGICIEN = "magicien";

	ArrayList<Personnage> persoList = new ArrayList<>();
	String choice="";
	Scanner sc = new Scanner(System.in);

	/**
	 * method for see all the perso
	 */
	private void seePerso() {
		for (int i = 0; i < persoList.size(); i++) {
			Personnage perso = persoList.get(i);
			System.out.println("id : " + i);
			System.out.println(perso);
		}

		System.out.println("souhaitez vous modifier un personnage ? o/n");
		if (sc.nextLine().toLowerCase().contentEquals("o")) {
			System.out.println("Lequel ? id");
			int id = sc.nextInt();
			sc.nextLine();
			changePerso(id);
		}
	}

	private void changePerso(int id) {
		Personnage modifyperso = persoList.get(id);
		System.out.println(modifyperso);
		System.out.println("que voulez vous changer ?");
		
		System.out.println("le nom ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeName = saisieName();
			modifyperso.setName(changeName);
		}
		
		System.out.println("l'image ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeImage= saisieImage();
			modifyperso.setImage(changeImage);
		}
		
		System.out.println("le niveau de vie ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			int changeLife = saisiePersoLife();
			modifyperso.setLevelOfLife(changeLife);
			sc.nextLine();
		}
		
		System.out.println("la force d'attaque ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			int changeAtt = saisieAttack();
			modifyperso.setLevelOfLife(changeAtt);
			sc.nextLine();
		}
			
		System.out.println("Souhaitez-vous créer un autre personage ? o/n");
		String res = sc.nextLine().toLowerCase();
		if (res.equals("o")) {
			choicePersonage();
		} else {
			seePerso();
		}
	}

	/**
	 * method to choice new perso between wizard or warrior
	 */
	public void choicePersonage() {
		System.out.println("souhaitez-vous créer un guerrier ou un magicien ?");
		choice = sc.nextLine().toLowerCase();			
		System.out.println("Vous avez saisi : " + choice);
		if(!(choice.equals(MAGICIEN) || choice.equals(GUERRIER))) {
			choicePersonage();
		}
		saisieInfoPersonage(choice);
	}

	/**
	 * method to enter the info of the new perso
	 * @param choice perso between wizard and warrior
	 */
	private void saisieInfoPersonage(String choice) {
		String persoName = saisieName();
		String persoImage= saisieImage();
		int persoLife = saisiePersoLife();
		int attack = saisieAttack(); 

		if (choice.equals(MAGICIEN)) {
			createWizard(persoName, persoImage, persoLife, attack);
		} else {
			createWarrior(persoName, persoImage, persoLife, attack);
		}
		sc.nextLine();
		System.out.println("Souhaitez-vous créer un autre personage ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			choicePersonage();
		} else {
			seePerso();
		}
	}

	/**
	 * method to create a new warrior and add it to arrayList 
	 * @param persoName
	 * @param persoImage
	 * @param persoLife
	 * @param attack
	 */
	private void createWarrior(String persoName, String persoImage, int persoLife, int attack) {
		persoList.add(new Warrior(persoName, persoImage, persoLife, attack));
	}

	/**
	 *  method to create a new warrior and add it to arrayList
	 * @param persoName
	 * @param persoImage
	 * @param persoLife
	 * @param attack
	 */
	private void createWizard(String persoName, String persoImage, int persoLife, int attack) {
		persoList.add(new Wizard(persoName, persoImage, persoLife, attack));
	}

	/**
	 * method to choice attack
	 * @return attack
	 */
	private int saisieAttack() {
		int attack; 
		System.out.println("choisissez une attaque entre 5 et 10:");
		attack = (int) sc.nextInt();
		if (attack<5 || attack>10) {
			saisieAttack();
		};
		return attack;
	}

	/**
	 * method to choice life
	 * @return life
	 */
	private int saisiePersoLife() {
		int persoLife; 
		System.out.println("choisissez un niveau de vie entre 5 et 10:");
		persoLife = (int) sc.nextInt();
		if(persoLife<5 || persoLife>10) {
			saisiePersoLife();
		};
		return persoLife;
	}

	/**
	 * method to choice image
	 * @return image
	 */
	private String saisieImage() {
		System.out.println("entrez le liens de l'image:");
		String persoImage= sc.nextLine();
		return persoImage;
	}

	/**
	 * method to choice name
	 * @return name
	 */
	private String saisieName() {
		System.out.println("choisissez son nom:");
		String persoName = sc.nextLine();
		return persoName;
	}

}
