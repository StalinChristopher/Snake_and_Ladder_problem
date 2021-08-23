package com.bl.snakeandladder;

public class SnakeAndLadderMain {
	
	public static void main(String[] args) {
		final int LADDER=1;
		final int SNAKE=2;
		final int NO_PLAY=3;
		
		int position = 0;
		int dieNum;
		int option;
		int dieCount=0;
		
		System.out.println("Welcome to Snake and Ladder program");
		
		while(position!=100) {
			dieCount++;
			System.out.printf("\nPlayer 1 current position : %d",position);
			
			dieNum=(int)Math.floor(Math.random()*((6-1)+1)+1);
			
			System.out.printf("\nDie number : %d",dieNum);
			
			option = (int)Math.floor(Math.random()*((3-1)+1)+1);
			switch(option) {
			case LADDER: 
				position+=dieNum;
				if(position>100) {
					System.out.printf("\nOption Ladder\nPosition exceeds 100. Hence player stays in the same position");
					position-=dieNum;
					System.out.printf("\nNew position: %d\n",position);
					break;
				}
				System.out.printf("\nOption Ladder\nPlayer has inclined by %d \nNew position: %d\n",dieNum,position);
				break;
			case SNAKE:
				position-=dieNum;
				if(position<0) {
					position=0;
					System.out.printf("\nOption Snake\nPlayer has declined by %d \nPosition<0. Hence position is set to 0 \nNew position: %d\n",dieNum,position);
					break;
				}
				System.out.printf("\nOption Snake \nPlayer has declined by %d \nNew position: %d\n",dieNum,position);
				break;
			case NO_PLAY:
				System.out.printf("\nOption No Play\nPlayer stays in the same position \nNew Position: %d\n",position);
			}
		}
		System.out.println();
		System.out.println("Total number of times the die was rolled : "+dieCount);
		System.out.printf("\nCongratulations!!!! \nYou have won the game");
		
		
		
	}

}
