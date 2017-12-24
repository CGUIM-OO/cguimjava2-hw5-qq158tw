 
import java.util.ArrayList;
import java.util.Random;

public class Deck {

// TODO Auto-generated method stub
		private ArrayList<Card> cards;
		private ArrayList<Card> usedCard;
		private ArrayList<Card>openCard;//存放此副牌中所有打開的牌，洗牌時要重置
		public int nUsed=0;
		 
		public Deck(int nDeck){
			nUsed=0;
			cards=new ArrayList<Card>();
			for(int deck=1;deck<=nDeck;deck++)
			{
			for (Card.Suit s : Card.Suit.values())
			{			
			for(int rank=1;rank<=13;rank++)
			{
			Card card=new Card(s,rank);
			cards.add(card);
			}}}
			nUsed=0;
			shuffle();
			}
		
		/*public void printDeck()
		{
		int n=0;//to get cards.get()
		while(cards.size()>n)//in this loop, n add 1 after every execution
		{ 
		Card card=new Card(cards.get(n).getSuit(),cards.get(n).getRank());
		//instance Card, cards.get().getSuit() for suit and cards.get(n).getRank() for numbers
		card.printCard();//run printCard() in Card class to print this card
		n++;
		}}*/
		
		public ArrayList<Card> getAllCards(){
		return cards;
		}
		
		
		/*拿到一張牌，修改原有method，加入isOpened參數，決定發出去的牌是開著還是蓋起來的。*/
		public Card getOneCard (boolean isOpened) //取得一張牌
		{   
			usedCard=new ArrayList<Card>();
			nUsed++;//發出去的牌數紀錄在nUsed
			Card card=new Card(cards.get(nUsed-1).getSuit(),cards.get(nUsed-1).getRank());//取一張牌，此張牌將被使用被發出
			usedCard.add(card);//發出的牌紀錄在usedCard
			if(nUsed==cards.size())//牌被發完，要重新洗牌
			{
				shuffle();//洗牌
			}
			if(isOpened=true)
			{
			openCard.add(card);
			}
			return card;
			
				}
		
		public ArrayList getOpenedCard()//回傳此副牌中所有打開過的牌
		{
			return openCard;
		}
		
		public void shuffle()//洗牌
		{
	
		openCard=new ArrayList<Card>();//重設openCard
		
				nUsed=0;
				int j=0;//用來存隨機的數字
				Random rnd = new Random();//取隨機數字
					while(nUsed!=cards.size()-1)
					{ 
				    	j =rnd.nextInt(cards.size()-nUsed);//範圍逐漸縮小
					    //第一次進入while時，j將等於由0~51(表共52張牌存於cards) 
						cards.set(j-1,cards.get(j));//隨機取一張牌牌，放到新的位置
						nUsed++;//每洗一張牌就加一
					}
					nUsed=0;
		}
		
			
		public Deck()
		{
			shuffle();
		}	
	
	

}
