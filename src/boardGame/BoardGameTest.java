package boardGame;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import box.EmptyBox;
import box.GameBox;
import box.GoblinBox;
import box.OrcBox;
import box.TreasureBox;

class BoardGameTest {

	@Test
	void testThatBordContains64Cases() {
		BoardGame game =new BoardGame();
		ArrayList<GameBox> bordplay = game.fillTheList();
		
		assertEquals(64,bordplay.size());
	}
	
	@Test
	void testIfInArrayListTheyareMinimumOneOfEachBox() {
		BoardGame game =new BoardGame();
		ArrayList<GameBox> bordplay = game.fillTheList();
		int countEmpty =0 ;
		int countGob =0 ;
		int countOrc =0 ;
		int countTreasure =0 ;
		int countSuperTreasure =0 ;
		
		for (int i=0;i<bordplay.size();i++) {
			GameBox box = bordplay.get(i);
			if (box instanceof EmptyBox) {
				countEmpty ++;
			}else if (box instanceof GoblinBox) {
				countGob ++ ;
			}else if (box instanceof OrcBox) {
				countOrc ++ ;
			}else if (box instanceof TreasureBox) {
				countTreasure ++ ;
			}else {
				countSuperTreasure ++;
			}
		}
		
		assertTrue(countEmpty>1);
		assertTrue(countGob>1);
		assertTrue(countOrc>1);
		assertTrue(countTreasure>1);
		assertTrue(countSuperTreasure>1);
	}

}
