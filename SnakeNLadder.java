package com.bl.snakenladder;

public class SnakeNLadder {
	
	static int positionUC1 = 1;
	int positionUC2 = (int) ((Math.random() * 6) + 1);
	
	void diceRolled() {
			System.out.println("Die Rolls, Position : On Square "+ positionUC2);
		}
	void optionCheck() {
		int  positionUC3 = (int) ((Math.random() * 6) + 1);
		int checkOption = (int) (Math.random() * 3);
		
		
	switch(checkOption) {
	
	case 0 : System.out.println("No Play!...same position");
			 break;
	case 1 : System.out.println("Yayyy...you climbed a ladder");
			 positionUC1 = positionUC2 + positionUC3;
	         System.out.println("Position : On Square " + positionUC1 );
			 break;
	case 2 : System.out.println("Oops...snake there");
			 positionUC1 = positionUC2 - positionUC3;
	         if (positionUC1 <= 0)
	        	 positionUC1 = 1;
	         System.out.println("Position : On Square " + positionUC1);
	         break;
			}
		}
	
public static void main(String args[]) {
		
		
		System.out.println("Snake And Ladder Simulator");
		
		byte player = 1;
//UC1
		System.out.println("Game Starts...");
		System.out.println("Number of Players " + player);
		System.out.println("Initial Position : On Square " + positionUC1);
//UC2	
		SnakeNLadder dice = new SnakeNLadder();
		dice.diceRolled();
//UC3
		SnakeNLadder opt = new SnakeNLadder();
		opt.optionCheck();
	}
}