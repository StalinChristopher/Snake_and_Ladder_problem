package com.bl.snakeandladder;

public class SnakeAndLadderMain {
	
	public static void main(String[] args) {
		
		int position = 0;
		int diceNum;
		
		System.out.println("Welcome to Snake and Ladder program");
		System.out.printf("\nPlayer 1 is in position : %d",position);
		
		diceNum=(int)Math.floor(Math.random()*((6-1)+1)+1);
		
		System.out.printf("\nDice number : %d",diceNum);
	}

}
