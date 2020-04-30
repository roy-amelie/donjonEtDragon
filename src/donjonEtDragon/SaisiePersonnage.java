package donjonEtDragon;

import java.util.ArrayList;
import java.util.Scanner;
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

	ArrayList<Object> persoList = new ArrayList<Object>();
	String choice="";
	Scanner sc = new Scanner(System.in);

	/**
	 * method for see all the perso
	 */
	public void SeePerso() {
		for (int i = 0; i< persoList.size(); i++) {
			System.out.println(persoList.get(i));
		}
	}

	/**
	 * method to choice new perso between wizard or warrior
	 */
	public void ChoicePersonage() {
		System.out.println("souhaitez-vous créer un guerrier ou un magicien ?");
		choice = sc.nextLine().toLowerCase();			
		System.out.println("Vous avez saisi : " + choice);
		if(!(choice.equals(MAGICIEN) || choice.equals(GUERRIER))) {
			ChoicePersonage();
		}
		SaisieInfoPersonage(choice);
	}

	/**
	 * method to enter the info of the new perso
	 * @param choice perso between wizard and warrior
	 */
	public void SaisieInfoPersonage(String choice) {
		String persoName = SaisieName();
		String persoImage= SaisieImage();
		int persoLife = SaisiePersoLife();
		int attack = SaisieAttack(); 
		
		if (choice.equals(MAGICIEN)) {
			CreateWizard(persoName, persoImage, persoLife, attack);
		} else {
			CreateWarrior(persoName, persoImage, persoLife, attack);
		}
		sc.nextLine();
		System.out.println("Souhaitez-vous créer un autre personage ? (oui/non)");
		String res = sc.nextLine().toLowerCase();
		if (res.equals("oui")) {
			ChoicePersonage();
		} else {
			SeePerso();
		}
	}
	
	/**
	 * method to create a new warrior and add it to arrayList 
	 * @param persoName
	 * @param persoImage
	 * @param persoLife
	 * @param attack
	 */
	private void CreateWarrior(String persoName, String persoImage, int persoLife, int attack) {
		Warrior perso = new Warrior(persoName, persoImage, persoLife, attack);
		persoList.add(perso);
	}

	/**
	 *  method to create a new warrior and add it to arrayList
	 * @param persoName
	 * @param persoImage
	 * @param persoLife
	 * @param attack
	 */
	private void CreateWizard(String persoName, String persoImage, int persoLife, int attack) {
		Wizard perso = new Wizard(persoName, persoImage, persoLife, attack);
		persoList.add(perso);
	}

	/**
	 * method to choice attack
	 * @return attack
	 */
	private int SaisieAttack() {
		int attack; 
			System.out.println("choisissez une attaque entre 5 et 10:");
			attack = (int) sc.nextInt();
		if (attack<5 || attack>10) {
			SaisieAttack();
		};
		return attack;
	}
	
	/**
	 * method to choice life
	 * @return life
	 */
	private int SaisiePersoLife() {
		int persoLife; 
			System.out.println("choisissez un niveau de vie entre 5 et 10:");
			persoLife = (int) sc.nextInt();
		if(persoLife<5 || persoLife>10) {
			SaisiePersoLife();
		};
		return persoLife;
	}

	/**
	 * method to choice image
	 * @return image
	 */
	private String SaisieImage() {
		System.out.println("entrez le liens de l'image:");
		String persoImage= sc.nextLine();
		return persoImage;
	}

	/**
	 * method to choice name
	 * @return name
	 */
	private String SaisieName() {
		System.out.println("choisissez son nom:");
		String persoName = sc.nextLine();
		return persoName;
	}

}
