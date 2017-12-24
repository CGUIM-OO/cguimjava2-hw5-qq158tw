import java.util.ArrayList;

public class Player extends Person{
	private String name;//玩家姓名
	private int chips;//玩家有的籌碼
	private int bet;//玩家此局下注的籌碼
	private ArrayList<Card> oneRoundCard;//此牌局的卡
	
	public Player(String name, int chips) //新增玩家
	{
		this. name=name;
		this.chips=chips;	
	}
	 
 
	@Override
	public boolean hit_me(Table table) {
		// TODO Auto-generated method stub

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

}
