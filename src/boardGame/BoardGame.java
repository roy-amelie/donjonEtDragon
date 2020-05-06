package boardGame;

import java.util.ArrayList;

import box.BonusBox;
import box.EmptyBox;
import box.EnemyBox;
import box.GameBox;

public class BoardGame {
		
	static final int BOARD_GAME_SIZE = 64 ;
	
	ArrayList<GameBox> boardGame= new ArrayList<GameBox>();
	
	public void fillTheList() {
		for (int i = 0; i < BOARD_GAME_SIZE; i++) {
			int n = (int) (Math.random()*3);
			if (n==0) {
				boardGame.add(new EmptyBox());
			} else if (n ==1) {
				boardGame.add(new EnemyBox());
			} else {
				boardGame.add(new BonusBox());
			}
		}
		viewList();
	}
	
	private void viewList() {
		 for (int i=0; i < boardGame.size(); i++){
			 GameBox box = boardGame.get(i);
			 System.out.println(box);
		 }
	}
}
