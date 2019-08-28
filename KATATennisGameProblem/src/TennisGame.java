
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
		if (firstPlayerScore==0 && secondPlayerScore==0) //score at start of game
		return "Love All";
		else 
		{
		if (isInvalid())
		return "Invalid input scores for game";
		else if (playerWinsGame()) // score if one player has won game
		{
			if (firstPlayerScore>secondPlayerScore)
			return getFirstPlayerName()+" wins";
			else
			return getSecondPlayerName()+" wins";
		}
		else if (isAdvantage()) //score in case of advantage
		{
			if (firstPlayerScore>secondPlayerScore)
			return "Advantage "+getFirstPlayerName();
			else
			return "Advantage "+getSecondPlayerName();
		}
		else if (isDeuce())
		return "Deuce";
		else if (firstPlayerScore==secondPlayerScore) // score in case of equal ball scores
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
	public boolean isInvalid()
	{
		return (firstPlayerScore>4 && firstPlayerScore>secondPlayerScore+2)|| (secondPlayerScore>4 && secondPlayerScore>firstPlayerScore+2);
			
	}
	
	public boolean isDeuce()
	{
		return (firstPlayerScore>=3 && firstPlayerScore==secondPlayerScore);
			
	}
	
	public boolean isAdvantage()
	{
		return (firstPlayerScore>3 && firstPlayerScore==secondPlayerScore+1)||(secondPlayerScore>3 && (secondPlayerScore==firstPlayerScore+1));
			
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
