package gameFunction;

import java.net.URL;

public class Table4x4{
	private int[][] table = new int[4][4];
	private long score = 0;
	
	//Constructor
	public Table4x4(){
	}
	
	//Set first table
	public void start(){
		score = 0;
		for(int col=0;col<4;col++)
			for(int row=0;row<4;row++)
				table[col][row] = 0;
		randomSpawn();
		randomSpawn();
			
	}
	
	//Random spawn 2 or 4
	public void randomSpawn(){
		while(checkZero()){
			int ran1 = (int)(Math.random()*4); 
			int ran2 = (int)(Math.random()*4);
			if(table[ran1][ran2]==0){
				table[ran1][ran2] = 2*(int)(1+Math.random()*1.2);
				break;
			}
		}
	}
	
	//Check all item of table are 0 or not
	public boolean checkZero(){
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++){
				if(table[i][j]==0)
					return true;
			}
		return false;
			
	}
	
	//Up action
	public void up(){
		if(CanPlay.canUp(table)){
			table = Move.upMove(table);	;
			score += Combine.upScore(table);
			table = Combine.upCombine(table);	
			table = Move.upMove(table);	
			randomSpawn();
		}
	}
	public void up(Table4x4 table2){
		if(CanPlay.canUp(table)){
			table = Move.upMove(table);	;
			score += Combine.upScore(table);
			table = Combine.upCombine(table);	
			table = Move.upMove(table);
			randomSpawn();
			table2.randomSpawn();
		}
	}
	
	//Down action
	public void down(){
		if(CanPlay.canDown(table)){
			table = Move.downMove(table);	
			score += Combine.downScore(table);
			table = Combine.downCombine(table);	
			table = Move.downMove(table);	
			randomSpawn();
		}
	}
	public void down(Table4x4 table2){
		if(CanPlay.canDown(table)){
			table = Move.downMove(table);	
			score += Combine.downScore(table);
			table = Combine.downCombine(table);	
			table = Move.downMove(table);	
			randomSpawn();
			table2.randomSpawn();
		}
	}
	
	//Left action
	public void left(){
		if(CanPlay.canLeft(table)){
			table = Move.leftMove(table);
			score += Combine.leftScore(table);
			table = Combine.leftCombine(table);	
			table = Move.leftMove(table);
			randomSpawn();
		}
	}
	public void left(Table4x4 table2){
		if(CanPlay.canLeft(table)){
			table = Move.leftMove(table);
			score += Combine.leftScore(table);
			table = Combine.leftCombine(table);	
			table = Move.leftMove(table);
			randomSpawn();
			table2.randomSpawn();
		}
		
	}
	
	//Right action
	public void right(){
		if(CanPlay.canRight(table)){
			table = Move.rightMove(table);
			score += Combine.rightScore(table);
			table = Combine.rightCombine(table);
			table = Move.rightMove(table);	
			randomSpawn();
		}
	}
	public void right(Table4x4 table2){
		if(CanPlay.canRight(table)){
			table = Move.rightMove(table);
			score += Combine.rightScore(table);
			table = Combine.rightCombine(table);
			table = Move.rightMove(table);
			randomSpawn();
			table2.randomSpawn();
		}
	}
	
	//Return true if game is end wait for delete if else
		public boolean gameOver(){
			return GameEnd.isGameEnd(table);
	}
		public boolean gameOver(boolean beat){
			return GameEnd.beatGame(table);
		}
		
		
	//Set Item
	/*Start*/
	public void setItem1(int num){
		table[0][0] = num;
	}
	
	public void setItem2(int num){
		table[0][1] = num;
	}

	public void setItem3(int num){
		table[0][2] = num;
	}
	
	public void setItem4(int num){
		table[0][3] = num;
	}

	public void setItem5(int num){
		table[1][0] = num;
	}
	
	public void setItem6(int num){
		table[1][1] = num;
	}

	public void setItem7(int num){
		table[1][2] = num;
	}
	
	public void setItem8(int num){
		table[1][3] = num;
	}

	public void setItem9(int num){
		table[2][0] = num;
	}
	
	public void setItem10(int num){
		table[2][1] = num;
	}

	public void setItem11(int num){
		table[2][2] = num;
	}
	
	public void setItem12(int num){
		table[2][3] = num;
	}

	public void setItem13(int num){
		table[3][0] = num;
	}
	
	public void setItem14(int num){
		table[3][1] = num;
	}

	public void setItem15(int num){
		table[3][2] = num;
	}
	
	public void setItem16(int num){
		table[3][3] = num;
	}
	/*End setItem*/
	
	
	
	
	//Get Item from table Return to integer
	/*Start*/
	public int getItem1(boolean to_int){
		return table[0][0];
	}

	public int getItem2(boolean to_int){
		return table[0][1];
	}

	public int getItem3(boolean to_int){
		return table[0][2];
	}

	public int getItem4(boolean to_int){
		return table[0][3];
	}

	public int getItem5(boolean to_int){
		return table[1][0];
	}

	public int getItem6(boolean to_int){
		return table[1][1];
	}

	public int getItem7(boolean to_int){
		return table[1][2];
	}

	public int getItem8(boolean to_int){
		return table[1][3];
	}

	public int getItem9(boolean to_int){
		return table[2][0];
	}

	public int getItem10(boolean to_int){
		return table[2][1];
	}

	public int getItem11(boolean to_int){
		return table[2][2];
	}

	public int getItem12(boolean to_int){
		return table[2][3];
	}

	public int getItem13(boolean to_int){
		return table[3][0];
	}

	public int getItem14(boolean to_int){
		return table[3][1];
	}

	public int getItem15(boolean to_int){
		return table[3][2];
	}

	public int getItem16(boolean to_int){
		return table[3][3];
	}
	/*End return integer table00-33*/
	
	
	
	
	//Return image path of item
	/*Start*/
	public URL getItem1(){
		return toImage(table[0][0]);
	}

	public URL getItem2(){
		return toImage(table[0][1]);
	}

	public URL getItem3(){
		return toImage(table[0][2]);
	}

	public URL getItem4(){
		return toImage(table[0][3]);
	}

	public URL getItem5(){
		return toImage(table[1][0]);
	}

	public URL getItem6(){
		return toImage(table[1][1]);
	}

	public URL getItem7(){
		return toImage(table[1][2]);
	}

	public URL getItem8(){
		return toImage(table[1][3]);
	}

	public URL getItem9(){
		return toImage(table[2][0]);
	}

	public URL getItem10(){
		return toImage(table[2][1]);
	}

	public URL getItem11(){
		return toImage(table[2][2]);
	}

	public URL getItem12(){
		return toImage(table[2][3]);
	}

	public URL getItem13(){
		return toImage(table[3][0]);
	}

	public URL getItem14(){
		return toImage(table[3][1]);
	}

	public URL getItem15(){
		return toImage(table[3][2]);
	}

	public URL getItem16(){
		return toImage(table[3][3]);
	}
	/*End Return path of image*/
	
	
	
	//Return Score to String
	public String getScore(){
		return " Score : "+score;
	}
	
	//Return Score to long integer
	public long getScore(int arg0){
		return score;
	}
	
	//Cheat set score and table
//	public void winCheat(){
//		score = 999999999;
//		for(int i=0;i<4;i++)
//			for(int j=0;j<4;j++)
//				table[i][j] = 2048 ;
		
//	}
	
	//Display table wait for delete
//	public void printTable(){
//		for(int i=0;i<4;i++){
//			for(int j=0;j<4;j++){
//				if(table[i][j]!=0)
//					System.out.print("["+table[i][j]+"] ");
//				else
//					System.out.print("[ ] ");
//			}
//			System.out.println();
//		}
//	}
	
	//return path of image
	public URL toImage(int i){
		switch(i){
			case 0:		return this.getClass().getResource("/blank.png");
			case 2: 	return this.getClass().getResource("/2.jpg");
			case 4: 	return this.getClass().getResource("/4.jpg");
			case 8: 	return this.getClass().getResource("/8.jpg");
			case 16:	return this.getClass().getResource("/16.jpg");
			case 32:	return this.getClass().getResource("/32.jpg");
			case 64:	return this.getClass().getResource("/64.jpg");
			case 128:	return this.getClass().getResource("/128.jpg");
			case 256:	return this.getClass().getResource("/256.jpg");
			case 512:  	return this.getClass().getResource("/512.jpg");
			case 1024: 	return this.getClass().getResource("/1024.jpg");
			case 2048: 	return this.getClass().getResource("/2048.jpg");
			case 4096:	return this.getClass().getResource("/4096.jpg");
			
			
			default: 
				return this.getClass().getResource("/blank.png");
		}
	}
	
}
