package donjonEtDragon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import boardGame.BoardGame;
import perso.Personnage;
import perso.Warrior;
import perso.Wizard;

/**
 * class for create personage
 * 
 *
 */
public class SaisiePersonnage {

	static final String GUERRIER="guerrier";
	static final String MAGICIEN = "magicien";

	static final String  SAISIE_LIFE ="le niveau de vie";
	static final int LIFE_MINIMUM = 5;
	static final int LIFE_MAXIMUM = 10;

	static final String  SAISIE_ATTACK ="la force d'attaque";
	static final int ATTACK_MINIMUM = 5;
	static final int ATTACK_MAXIMUM = 10;

	static final String SAISIE_IMAGE = "entrer le liens de l'image :";

	static final String SAISIE_NAME= "choisissez son nom:";

	static final String SAISIE_SHIELD = "entrer le nom du bouclier";
	static final String  SAISIE_WEAPON_NAME ="le nom de l'arme";
	static final String  SAISIE_WEAPON_ATT ="l'attaque de l'arme";
	static final int WEAPON_MINIMUM = 5;
	static final int WEAPON_MAXIMUM = 10;

	static final String SAISIE_PHILTRE = "entrer le nom du philtre";
	static final String SAISIE_SPELL_NAME = "le nom du sort";
	static final String SAISIE_SPELL_ATT = "l'attaque du sort";
	static final int SPELL_MINIMUM = 5 ;
	static final int SPELL_MAXIMUM = 10;

	ArrayList<Personnage> persoList = new ArrayList<Personnage>();
	String choice="";

	Scanner sc = new Scanner(System.in);

	/**
	 * method for see all the personage
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

	/**
	 * method to modify one personage with the id
	 * @param id
	 */
	private void changePerso(int id) {
		Personnage modifyperso = persoList.get(id);
		System.out.println(modifyperso);
		System.out.println("que voulez vous changer ?");

		System.out.println("le nom ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeName = saisieString(SAISIE_NAME);
			modifyperso.setName(changeName);
		}

		System.out.println("l'image ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeImage= saisieString(SAISIE_IMAGE);
			modifyperso.setImage(changeImage);
		}

		System.out.println("le niveau de vie ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			int changeLife = saisiePersoInt(SAISIE_LIFE, LIFE_MINIMUM, LIFE_MAXIMUM);
			modifyperso.setLevelOfLife(changeLife);
		}

		System.out.println("la force d'attaque ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			int changeAtt = saisiePersoInt(SAISIE_ATTACK, ATTACK_MINIMUM, ATTACK_MAXIMUM);
			modifyperso.setAttackForce(changeAtt);
		}

		System.out.println("le nom l'equipement de defence ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeShield = saisieString(SAISIE_SHIELD);
			((Warrior) modifyperso).setEquipementDef(changeShield);
		}

		System.out.println("l'equipement d'attaque? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			String changeWeaponName = saisieString(modifyperso.getTypeEquipementAtt());
			int changeWeaponForce = saisiePersoInt(SAISIE_WEAPON_ATT, WEAPON_MINIMUM, WEAPON_MAXIMUM);
			((Warrior) modifyperso).setEquipementAtt(changeWeaponName, changeWeaponForce);
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
	 * method to choice new personage between wizard or warrior
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
	 * method to enter the info of the new personage
	 * @param choice personage between wizard and warrior
	 */
	public void saisieInfoPersonage(String choice) {
		String persoName = saisieString(SAISIE_NAME);
		String persoImage= saisieString(SAISIE_IMAGE);
		int persoLife = saisiePersoInt(SAISIE_LIFE, LIFE_MINIMUM, LIFE_MAXIMUM);
		int attack = saisiePersoInt(SAISIE_ATTACK, ATTACK_MINIMUM, ATTACK_MAXIMUM); 

		if (choice.equals(MAGICIEN)) {
			createWizard(persoName, persoImage, persoLife, attack);
		} else {
			createWarrior(persoName, persoImage, persoLife, attack);
		}
		sc.nextLine();
		
		/*================start game =====================*/
		PlayGame play = new PlayGame();
		play.start(persoList.get(0));
		System.out.println("Souhaitez-vous créer un autre personage ? o/n");
		if (sc.nextLine().toLowerCase().equals("o")) {
			choicePersonage();
		} else {
			System.out.println("souhaitez vous jouer ? o/n");
			if (sc.nextLine().toLowerCase().equals("o")) {
				
			}
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
	 *  method to create a new wizard and add it to arrayList
	 * @param persoName
	 * @param persoImage
	 * @param persoLife
	 * @param attack
	 */
	private void createWizard(String persoName, String persoImage, int persoLife, int attack) {
		persoList.add(new Wizard(persoName, persoImage, persoLife, attack));
	}

	/**
	 * method to choice all integer (life or attack)
	 * @param typeChoice (text message for print)
	 * @param min 
	 * @param max
	 * @return integer
	 */
	private int saisiePersoInt(String typeChoice, int min, int max) { 
		int persoInt; 
		try {
			System.out.println("choisissez "+ typeChoice+" entre "+min+" et "+max); 
			persoInt=sc.nextInt();
			sc.nextLine();
			if(persoInt<min || persoInt>max) {
				saisiePersoInt(typeChoice, min, max);
			}; 
			return persoInt; 
		} catch (InputMismatchException e) { 
			System.out.println("vous n'avez pas rentré un monbre entier"); 
			sc.nextLine();
			return saisiePersoInt(typeChoice, min, max); 
		} catch (NoSuchElementException e) {
			System.out.println("vous n'avez rien rentré"); 
			sc.nextLine();
			return saisiePersoInt(typeChoice, min, max);
		}
	}

	/**
	 * method to choice all String (picture or name)
	 * @param typeChoice (text message for print)
	 * @return String
	 */
	private String saisieString(String typeChoice) {
		System.out.println(typeChoice);
		String persoString= sc.nextLine();
		return persoString;
	}

}
