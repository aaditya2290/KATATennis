
public class TennisGame {
	
	private String firstPlayerName;
	private String secondPlayerName;

	TennisGame(String firstPlayer,String secondPlayer)
	{
		this.firstPlayerName=firstPlayer;
		this.secondPlayerName=secondPlayer;
				
	}
	
	public String getGameScore()
	{
		return "Love All";
	}
	
	public String getFirstPlayerName() {
		return firstPlayerName;
	}

	public String getSecondPlayerName() {
		return secondPlayerName;
	}

}
