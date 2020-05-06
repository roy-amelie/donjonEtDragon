
import boardGame.BoardGame;
import donjonEtDragon.SaisiePersonnage;

/**
 *class for access personage, the entry
 *
 *
 */
public class main {
	public static void main(String[] args) {
		/*===============entrée pour saisie perso==========*/
		//SaisiePersonnage saisie = new SaisiePersonnage();
		//saisie.choicePersonage();
		
		/*===============entrée pour create boardgame==========*/
		BoardGame game = new BoardGame();
		game.fillTheList();
	}
}
