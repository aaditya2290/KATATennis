
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
		if (firstPlayerScore==secondPlayerScore)
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
	
	public void firstPlayerWinsBall()
	{
		firstPlayerScore++;	
	}
	
	public void secondPlayerWinsBall()
	{
		secondPlayerScore++;	
	}
	
	public String getFirstPlayerName() {
		return firstPlayerName;
	}

	public String getSecondPlayerName() {
		return secondPlayerName;
	}

}
