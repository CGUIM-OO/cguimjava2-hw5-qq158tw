 
import java.util.ArrayList;
import java.util.Random;

public class Deck {

// TODO Auto-generated method stub
		private ArrayList<Card> cards;
		private ArrayList<Card> usedCard;
		private ArrayList<Card>openCard;//�s�񦹰ƵP���Ҧ����}���P�A�~�P�ɭn���m
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
		
		
		/*����@�i�P�A�ק�즳method�A�[�JisOpened�ѼơA�M�w�o�X�h���P�O�}���٬O�\�_�Ӫ��C*/
		public Card getOneCard (boolean isOpened) //���o�@�i�P
		{   
			usedCard=new ArrayList<Card>();
			nUsed++;//�o�X�h���P�Ƭ����bnUsed
			Card card=new Card(cards.get(nUsed-1).getSuit(),cards.get(nUsed-1).getRank());//���@�i�P�A���i�P�N�Q�ϥγQ�o�X
			usedCard.add(card);//�o�X���P�����busedCard
			if(nUsed==cards.size())//�P�Q�o���A�n���s�~�P
			{
				shuffle();//�~�P
			}
			if(isOpened=true)
			{
			openCard.add(card);
			}
			return card;
			
				}
		
		public ArrayList getOpenedCard()//�^�Ǧ��ƵP���Ҧ����}�L���P
		{
			return openCard;
		}
		
		public void shuffle()//�~�P
		{
	
		openCard=new ArrayList<Card>();//���]openCard
		
				nUsed=0;
				int j=0;//�ΨӦs�H�����Ʀr
				Random rnd = new Random();//���H���Ʀr
					while(nUsed!=cards.size()-1)
					{ 
				    	j =rnd.nextInt(cards.size()-nUsed);//�d��v���Y�p
					    //�Ĥ@���i�Jwhile�ɡAj�N�����0~51(��@52�i�P�s��cards) 
						cards.set(j-1,cards.get(j));//�H�����@�i�P�P�A���s����m
						nUsed++;//�C�~�@�i�P�N�[�@
					}
					nUsed=0;
		}
		
			
		public Deck()
		{
			shuffle();
		}	
	
	

}
