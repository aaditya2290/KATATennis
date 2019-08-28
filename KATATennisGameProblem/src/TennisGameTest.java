import static org.junit.Assert.*;

import org.junit.Test;


public class TennisGameTest {
	
	TennisGame game;
	
	public TennisGameTest()
	{
	   game=new TennisGame("Player-1","Player-2");
	}

	@Test
	public void testInitialGameScore() {
		assertEquals("Love All",game.getGameScore());
	}

}
