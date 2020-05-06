package boardGame;

import java.util.ArrayList;

import box.BonusBox;
import box.EmptyBox;
import box.EnemyBox;
import box.GameBox;
import box.GoblinBox;
import box.OrcBox;
import box.SuperTreasureBox;
import box.TreasureBox;
import perso.Personnage;

public class BoardGame {
		
	static final int BOARD_GAME_SIZE = 64 ;
	
	ArrayList<GameBox> boardGame= new ArrayList<GameBox>();
	
	public ArrayList<GameBox> fillTheList() {
		for (int i = 0; i < BOARD_GAME_SIZE; i++) {
			int n = (int) (Math.random()*3);
			if (n==0) {
				boardGame.add(new EmptyBox());
			} else if (n ==1) {
				boardGame.add(createEnemyBox());
			} else {
				boardGame.add(createBonusBox());
			}
		}
		viewList();
		return boardGame;
	}
	
	private GameBox createEnemyBox() {
		int n = (int)(Math.random()*2);
		if (n == 0) {
			return new OrcBox();
		} else {
			return new GoblinBox();
		}
	}
	
	private GameBox createBonusBox() {
		int n = (int)(Math.random()*2);
		if (n == 0) {
			return new TreasureBox();
		} else {
			return new SuperTreasureBox();
		}
	}
	
	private void viewList() {
		 for (int i=0; i < boardGame.size(); i++){
			 GameBox box = boardGame.get(i);
			 System.out.println(box.getEventName());
		 }
	}
	


}
