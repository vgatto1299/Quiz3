package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int rankNumber;
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (int i = 0; i < cards.size(); i++)
		{
			rankNumber = cards.get(i).geteRank().getiRankNbr();
			
			
			if (rankNumber >= 2 && rankNumber <= 10) {
				iScore[0] += rankNumber;
				iScore[1] += rankNumber;
			}
			if (rankNumber > 10 && rankNumber < 14) {
				rankNumber = 10;
				iScore[0] += rankNumber;
				iScore[1] += rankNumber;
			}
			else if (rankNumber == 14 || rankNumber == 1) {
				iScore[0] += 1;
				if (iScore[1] + 11 > 21) {
					iScore[1] += 1;
				}
				else {
					iScore[1] += 11;
				}
			}
		}
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		AddCard(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
//cards.get(i-1).geteRank().getiRankNbr() == 14 || cards.get(i-1).geteRank().getiRankNbr() == 1