package HW4;

import java.util.ArrayList;

public class player {
		private String name;
		private int chips;
		private int bet=0;
		private ArrayList<Card> oneRoundCard=new ArrayList<>();
	
		public player (String name, int chips){
			this.name = name;
			this.chips = chips;
		}
		
		public String get_name(){
		return name;
}
		public int make_bet(){
			if (bet>chips)
			{
				return bet;
			}
		else
		bet = 1;
		return bet;
		}
		
		public void setOneRoundCard(ArrayList<Card> cards){
		oneRoundCard=cards;}
		
		public boolean hit_me(){
			if(this.getTotalValue()<17)
				return true;
			else return false;
		}
		public int getTotalValue(){
			int total=0;
			for (int i=0;i<oneRoundCard.size();i++){
			if (oneRoundCard.get(i).getRank()>10)
				total +=10;
			else
				total +=oneRoundCard.get(i).getRank();
			}
			return total;
		}
		public int get_current_chips(){
			return chips;
		}
		public void increase_chips (int diff){
			chips+=diff;
		}
		public void say_hello(){
		System.out.println("Hello, I am " + name + "."); 
		System.out.println("I have " + chips + " chips.");
	}
		}

