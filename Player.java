import java.util.ArrayList;

public class Player {
	private String name;//���a�m�W
	private int chips;//���a�����w�X
	private int bet;//���a�����U�`���w�X
	private ArrayList<Card> oneRoundCard;//���P�����d
	private ArrayList<Player> players;
	Player player=new Player(name,chips);
	public Player(String name, int chips) //�s�W���a
	{
	  name=this.name;
	  chips=this.chips;	
	}

	public String getName()
	{
		return name;
	}
	public int makeBet()//�U�`
	{ 
		bet=1;
		return bet;
		
	}
	public void setOneRoundCard(ArrayList cards)//�]�w���P���ұo�쪺�d
	{
		oneRoundCard=cards;
	}
	public boolean hitMe()//�O�_�n�P
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
	public int getTotalValue()//�^�Ǧ��P���ұo���d�I�ƥ[�`
	{
		int totalValue = 0;
		for(int i=0;i<oneRoundCard.size();i++)
		{
			totalValue+=oneRoundCard.get(i).getRank();
		}
		
		return totalValue;
	}
	public int getCurrentChips()//�^�Ǫ��a�{���w�X
	{
		return chips;
	}
	public void increaseChips (int diff)//���a�w�X�ܰ�
	{
		chips+=diff;
	}
	public void sayHello()
	{
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	
	
	
}
