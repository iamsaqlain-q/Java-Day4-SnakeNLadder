package com.bl.snakenladder;

public class SnakeNLadder {
	
	public static void main(String args[]) {
		final int POSITION = 0;
		
		System.out.println("Snake And Ladder Simulator");
		
		byte player = 1;
//UC1
		System.out.println("Game Starts...");
		System.out.println("Number of Players " + player);
		System.out.println("Position : On Square " + POSITION);
//UC2	
		SnakeNLadder dice = new SnakeNLadder();
		dice.diceRolled();
}
	void diceRolled() {
			int new_position = (int) ((Math.random() *6)+1);
			System.out.println("Player moved to "+ new_position);
		}
}
