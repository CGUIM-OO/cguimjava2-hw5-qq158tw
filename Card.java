

public class Card {
enum Suit{Club,Diamond,Heart,Spades};
	
		// TODO Auto-generated method stub
        //private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		private Suit suit;//Club,Diamond,Heart,Spades
		public Card(Suit s,int r)
		{
	       suit=s;
		   rank=r;
			  }
		//TODO:Please implement the printCard method (20 points, 10 for suit, 10 for rank)	 
		public void printCard()
		 {//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		String []R={"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
		 if(getRank()>9) 
		 {
			 R[getRank()-1]="10";
			  }
		System.out.println(getSuit().name()+" "+R[getRank()-1]);//印出花色及牌的大小
			}
			
		 
		public Suit getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
	}
	 

