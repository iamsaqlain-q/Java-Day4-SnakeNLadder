package com.bl.snakenladder;

import java.util.Scanner;

public class SnakeNLadder {
	
	static int positionUC1 = 1;
	int positionUC2 = (int) ((Math.random() * 6) + 1);
	static String player1name;
	static String player2name;
	
	
public static void main(String args[]) {
		
		
		System.out.println("Snake And Ladder Simulator");
		
		byte player = 1;
//UC1
		System.out.println("Game Starts...");
		System.out.println("Number of Players " + player);
		System.out.println("Initial Position : On Square [" + positionUC1 + "]");
//UC2	
		SnakeNLadder dice = new SnakeNLadder();
		dice.diceRolled();
//UC3
		SnakeNLadder opt = new SnakeNLadder();
		opt.optionCheck();
//UC4
		SnakeNLadder tillH = new SnakeNLadder();
		tillH.tillHundred();
//UC5		
		SnakeNLadder exactH = new SnakeNLadder();
		exactH.exactHundred();
//UC6
		SnakeNLadder countd = new SnakeNLadder();
		countd.countDiceNum();
//UC7
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the name of Player 1 : ");
		player1name = sc.next();
		System.out.print("Enter the name of Player 2 : ");
		player2name = sc.next();
	    System.out.println("\nInitial position of " + player1name + " & " + player2name + " is Square [1]\n");
	    playerOne();
	    sc.close();
	}

	
	void diceRolled() {
		    positionUC2 = positionUC1 + positionUC2;
			System.out.println("Die Rolls, Position : On Square[" + positionUC2 + "]");
		}
	void optionCheck() {
		int  positionUC3 = (int) ((Math.random() * 6) + 1);
		int checkOption = (int) (Math.random() * 3);
		      
	switch(checkOption) {
	
	case 0 : System.out.println("No Play!...same position");
			 break;
	case 1 : System.out.println("Yayyy...you climbed a ladder");
			 positionUC3 = positionUC3 + positionUC2;
	         System.out.println("Position : On Square [" + positionUC3 + "]");
			 break;
	default : System.out.println("Oops...snake there");
			 positionUC3 = positionUC2 - positionUC3;
	         if (positionUC3 <= 0)
	        	 positionUC3 = 1;
	         System.out.println("Position : On Square [" + positionUC3 + "]");
	         break;
			}
		}
	
 void tillHundred() {
	 int positionUC4 = (int) ((Math.random() * 6) + 1);
	 do {
		 positionUC4 = positionUC4 + positionUC4; 
//		 System.out.println("Position : On Square [" + positionUC4 + "]");
	 }while(positionUC4 < 99);
	 if(positionUC4 >= 100)
		 System.out.println("Congrates you reached On Square : 100");
 }
 
 void exactHundred() {
	 int positionUC5 = 1;
	 for (int i = 1; i <= 100; i++)
	 {
		 positionUC5 = i;
	 }
	 if(positionUC5 == 100)
		 System.out.println("Congrates player one has won :)");
 }
 
 void countDiceNum() {
	 int positionUC6 = (int) ((Math.random() * 6) + 1);
	 int count = 1;
	 while(positionUC6 <= 100) {
		 
		 positionUC6 = positionUC6 + positionUC6;  
//		 System.out.println("Position : On Square [" + positionUC6 + "]");
		 count++;
	      }
	 System.out.println("Dice thrown " + (count+1) + " numbers of time to reach 100");
	 }
 
static void playerOne(){
	
	String name = player1name;
	int positionUC7 = (int) ((Math.random() * 6) + 1);
	for(int i = 0; positionUC7 < 100 ; i++)
	{
		int newposition = (int) ((Math.random() * 6) + 1); 
		if(positionUC7 + newposition <= 100)
		{
			positionUC7 = positionUC7 + newposition;
		}
		
		// System.out.println("Position : On Square [" + positionUC7 + "]");
//		if(positionUC7 >= 100)
//			System.out.println(name + " won");
	}
	
	String name2 = player2name;
	int positionUC8 = (int) ((Math.random() * 6) + 1);
	for(int i = 0; positionUC8 < 100 ; i++)
	{
		int newposition = (int) ((Math.random() * 6) + 1); 
		if(positionUC8 + newposition <= 100)
		{
			positionUC8 = positionUC8 + newposition;
		}
		
		// System.out.println("Position : On Square [" + positionUC8 + "]");	
	}
	if(positionUC7 > positionUC8)
		System.out.println("Congrates " + name + " you won");
	else
		System.out.println("Congrates " + name2 + " you won");
	
  }
}