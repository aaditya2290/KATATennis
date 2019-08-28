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
	
	@Test
	public void testPlayerWinsBall() {
		game.firstPlayerWinsBall();
		assertEquals("Fifteen-Love",game.getGameScore());
	}
	
	@Test
	public void testPlayersWinEqualBalls() {
		game.firstPlayerWinsBall();
		game.secondPlayerWinsBall();
		assertEquals("Fifteen All",game.getGameScore());
	}
	
	@Test
	public void testPlayerWinsGame() {
		createGame(4,1);
		assertEquals("Player-1 wins",game.getGameScore());
		game.resetScores();
		createGame(2,4);
		assertEquals("Player-2 wins",game.getGameScore());
		
	}
	
	@Test
	public void testAdvantage() {
		createGame(3,4);
		assertEquals("Advantage Player-2",game.getGameScore());
		
	}
	
	public void createGame(Integer firstPlayerScore,Integer secondPlayerScore)
	{
		for (int i=0;i<firstPlayerScore;i++)
		game.firstPlayerWinsBall();
		for (int i=0;i<secondPlayerScore;i++)
		game.secondPlayerWinsBall();	
	}

}
