package com.bl.snakeandladder;

public class SnakeAndLadderMain {
	
	public static void main(String[] args) {
		
		int position = 0;
		int dieNum;
		int option;
		
		System.out.println("Welcome to Snake and Ladder program");
		
		while(position<=100) {
//			if(position<0)
//				position=0;
			System.out.printf("\nPlayer 1 current position : %d",position);
			
			dieNum=(int)Math.floor(Math.random()*((6-1)+1)+1);
			
			System.out.printf("\nDie number : %d",dieNum);
			
			option = (int)Math.floor(Math.random()*((3-1)+1)+1);
			switch(option) {
			case 1: 
				position+=dieNum;
				System.out.printf("\nOption Ladder\nPlayer has inclined by %d \nNew position: %d\n",dieNum,position);
				break;
			case 2:
				position-=dieNum;
				if(position<0) {
					position=0;
					System.out.printf("\nOption Snake\nPlayer has declined by %d \nPosition<0 \nNew position: %d\n",dieNum,position);
					break;
				}
				System.out.printf("\nOption Snake \nPlayer has declined by %d \nNew position: %d\n",dieNum,position);
				break;
			case 3:
				System.out.printf("\nOption No Play\nPlayer stays in the same position \nNew Position: %d\n",position);
			}
		}
		System.out.printf("\nCongratulations!!!! \nYou have won the game");
		
		
		
	}

}
