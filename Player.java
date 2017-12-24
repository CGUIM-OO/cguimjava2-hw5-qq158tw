import java.util.ArrayList;

public class Player {
	private String name;//玩家姓名
	private int chips;//玩家有的籌碼
	private int bet;//玩家此局下注的籌碼
	private ArrayList<Card> oneRoundCard;//此牌局的卡
	private ArrayList<Player> players;
	Player player=new Player(name,chips);
	public Player(String name, int chips) //新增玩家
	{
	  name=this.name;
	  chips=this.chips;	
	}

	public String getName()
	{
		return name;
	}
	public int makeBet()//下注
	{ 
		bet=1;
		return bet;
		
	}
	public void setOneRoundCard(ArrayList cards)//設定此牌局所得到的卡
	{
		oneRoundCard=cards;
	}
	public boolean hitMe()//是否要牌
	{
		
		boolean hitMe;
		if(getTotalValue()<17)
		{
			hitMe=true;
		}
		else
		{	hitMe=false;
		}
		return hitMe;
	}
	public int getTotalValue()//回傳此牌局所得的卡點數加總
	{
		int totalValue = 0;
		for(int i=0;i<oneRoundCard.size();i++)
		{
			totalValue+=oneRoundCard.get(i).getRank();
		}
		
		return totalValue;
	}
	public int getCurrentChips()//回傳玩家現有籌碼
	{
		return chips;
	}
	public void increaseChips (int diff)//玩家籌碼變動
	{
		chips+=diff;
	}
	public void sayHello()
	{
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	
	
	
}
