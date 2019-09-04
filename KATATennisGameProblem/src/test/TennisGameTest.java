package test;
import static org.junit.Assert.*;
import main.TennisGame;

import org.junit.Before;
import org.junit.Test;


public class TennisGameTest {

	TennisGame game;

	@Before
	public void initializeTennisGame()
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
		game.resetScores();
		createGame(5,4);
		assertEquals("Advantage Player-1",game.getGameScore());

	}

	@Test
	public void testDeuce() {
		createGame(3,3);
		assertEquals("Deuce",game.getGameScore());
		game.resetScores();
		createGame(5,5);
		assertEquals("Deuce",game.getGameScore());

	}

	@Test
	public void testInvalidGame() {
		createGame(10,3);
		assertEquals("Invalid input scores for game",game.getGameScore());
		game.resetScores();
		createGame(5,8);
		assertEquals("Invalid input scores for game",game.getGameScore());

	}

	public void createGame(Integer firstPlayerScore,Integer secondPlayerScore)
	{
		for (int i=0;i<firstPlayerScore;i++)
			game.firstPlayerWinsBall();
		for (int i=0;i<secondPlayerScore;i++)
			game.secondPlayerWinsBall();	
	}

}
