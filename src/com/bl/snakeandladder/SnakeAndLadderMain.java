package com.bl.snakeandladder;

public class SnakeAndLadderMain {
	
	public static void main(String[] args) {
		
		
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		int PLAYER1_WIN=1;
		int PLAYER2_WIN=2;
		int win_flag;
		
		System.out.println("Welcome to Snake and Ladder program");
		while (true) {
			p1.play();
			if(p1.position==100) {
				win_flag=PLAYER1_WIN;
				break;
			}
			p2.play();
			if(p2.position==100) {
				win_flag=PLAYER2_WIN;
				break;
			}
		}
		if(win_flag==PLAYER1_WIN) {
			System.out.println("Total number of times the die was rolled : "+p1.dieCount);
			System.out.printf("\nCongratulations player 1!!!! \nYou have won the game");
		}else {
			System.out.println("Total number of times the die was rolled : "+p2.dieCount);
			System.out.printf("\nCongratulations player2!!!! \nYou have won the game");
		}
		
		
		
	}

}

class Player{
	final int LADDER=1;
	final int SNAKE=2;
	final int NO_PLAY=3;
	
	int position = 0;
	int dieNum;
	int option;
	int dieCount=0;
	int playerId;
	
	Player(int playerId){
		this.playerId=playerId;
	}
	
	void play() {
		dieCount++;
		System.out.printf("\nPlayer %d current position : %d",playerId,position);
		
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
				play();
				break;
			}
			System.out.printf("\nOption Ladder\nPlayer has inclined by %d \nNew position: %d\n",dieNum,position);
			play();
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
	
}
