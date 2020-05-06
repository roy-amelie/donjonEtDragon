package donjonEtDragon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import box.EmptyBox;
import box.GameBox;
import box.GoblinBox;
import box.OrcBox;
import box.SuperTreasureBox;
import box.TreasureBox;
import perso.Personnage;
import perso.Warrior;
import perso.Wizard;

class PlayGameTest {

	@Test
	void testIfEmptyBoxLifeNotMove(){
		GameBox box = new EmptyBox();
		Personnage perso = new Wizard("toto","tutu",6,6 );
		box.event(perso);
		
		assertEquals(6, perso.getLevelOfLife());
	}
	
	@Test
	void testIfGoblinBoxLifelost1(){
		GameBox box = new GoblinBox();
		Personnage perso = new Wizard("toto","tutu",6,6 );
		box.event(perso);
		
		assertEquals(5, perso.getLevelOfLife());
	}
	
	@Test
	void testIfOrcBoxLifelost3(){
		GameBox box = new OrcBox();
		Personnage perso = new Wizard("toto","tutu",6,6 );
		box.event(perso);
		
		assertEquals(3, perso.getLevelOfLife());
	}

	@Test
	void testIfTreasureBoxLifeAdd1(){
		GameBox box = new TreasureBox();
		Personnage perso = new Wizard("toto","tutu",6,6 );
		box.event(perso);
		
		assertEquals(7, perso.getLevelOfLife());
	}
	
	@Test
	void testIfSuperTreasureBoxLifeAdd3(){
		GameBox box = new SuperTreasureBox();
		Personnage perso = new Wizard("toto","tutu",6,6 );
		box.event(perso);
		
		assertEquals(9, perso.getLevelOfLife());
	}
	
}
