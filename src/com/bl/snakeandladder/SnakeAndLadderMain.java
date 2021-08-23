package com.bl.snakeandladder;

public class SnakeAndLadderMain {
	
	public static void main(String[] args) {
		
		int position = 0;
		int diceNum;
		int option;
		
		System.out.println("Welcome to Snake and Ladder program");
		System.out.printf("\nPlayer 1 is in position : %d",position);
		
		diceNum=(int)Math.floor(Math.random()*((6-1)+1)+1);
		
		System.out.printf("\nDice number : %d\n",diceNum);
		
		option = (int)Math.floor(Math.random()*((3-1)+1)+1);
		switch(option) {
		case 1: 
			position+=diceNum;
			System.out.printf("\nOption Ladder : Player has inclined by %d and moved into position %d\n",diceNum,position);
			break;
		case 2:
			position-=diceNum;
			System.out.printf("\nOption Snake : Player has declined by %d and moved into position %d\n",diceNum,position);
			break;
		case 3:
			System.out.printf("\nOption No Play : Player stays in the same position %d\n",position);
		}
	}

}
