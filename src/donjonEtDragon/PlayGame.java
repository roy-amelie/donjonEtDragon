package donjonEtDragon;

import java.util.ArrayList;

import boardGame.BoardGame;
import box.GameBox;
import perso.Personnage;

public class PlayGame {
	
	BoardGame board = new BoardGame();
	ArrayList<GameBox> bordplay = board.fillTheList();
	int positionPerso = 0;
	
	public void start(Personnage perso) {
		for (int i=0; i<bordplay.size();i++) {
			openBox(perso,bordplay.get(i));
		}
		
	}
	
	public void openBox(Personnage perso, GameBox box) {
		System.out.println("Niveau de vie en entrant sur la case : "+perso.getLevelOfLife());
		System.out.println(box.getEventName());
		box.event(perso);
		System.out.println("Niveau de vie en sortant de la case : "+perso.getLevelOfLife());
	}

}
