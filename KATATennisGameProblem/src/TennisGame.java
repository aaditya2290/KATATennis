
public class TennisGame {
	
	private String firstPlayerName;
	private String secondPlayerName;
	private Integer firstPlayerScore=0;
	private Integer secondPlayerScore=0;

	TennisGame(String firstPlayer,String secondPlayer)
	{
		this.firstPlayerName=firstPlayer;
		this.secondPlayerName=secondPlayer;
				
	}
	
	public String getGameScore()
	{
		if (firstPlayerScore==0 && secondPlayerScore==0)
		return "Love All";
		else 
		{
		if (playerWinsGame())
		{
			if (firstPlayerScore>secondPlayerScore)
			return getFirstPlayerName()+" wins";
			else
			return getSecondPlayerName()+" wins";
		}
		else if (firstPlayerScore==secondPlayerScore)
		return calculateScore(firstPlayerScore)+" All";
		else
		return calculateScore(firstPlayerScore)+"-"+calculateScore(secondPlayerScore);
		}
				
	}
	
	public String calculateScore(Integer score)
	{
		if (score==0)
		return "Love";
		else if (score==1)
		return "Fifteen";
		else if (score==2)
		return "Thirty";
		else if (score==3)
		return "Forty";
		else return "Invalid score";
			
	}
	
	public boolean playerWinsGame()
	{
		return (firstPlayerScore>=4 && firstPlayerScore>=secondPlayerScore+2)||(secondPlayerScore>=4 && secondPlayerScore>=firstPlayerScore+2);
			
	}
	
	public void firstPlayerWinsBall()
	{
		firstPlayerScore++;	
	}
	
	public void secondPlayerWinsBall()
	{
		secondPlayerScore++;	
	}
	
	public void resetScores()
	{
		firstPlayerScore=0;
		secondPlayerScore=0;
	}
	
	
	
	public String getFirstPlayerName() {
		return firstPlayerName;
	}

	public String getSecondPlayerName() {
		return secondPlayerName;
	}

}
