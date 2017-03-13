package gameFunction;


public class Move {
	
	//Table up
	public static int[][] upMove(int[][] table){
		for(int round=1;round<=4;round++)
			for(int i=0;i<3;i++)
				for(int j=0;j<4;j++){
					if(table[i][j]==0){
						table[i][j] = table[i+1][j];
						table[i+1][j] = 0;
					}
				}
		return table;
	}
	
	//Table down
	public static int[][] downMove(int[][] table){
		for(int round=1;round<=4;round++)
			for(int i=3;i>0;i--)
				for(int j=0;j<4;j++){
					if(table[i][j]==0){
						table[i][j] = table[i-1][j];
						table[i-1][j] = 0;
					}
				}
		return table;
	}
	
	//Table left
	public static int[][] leftMove(int[][] table){
		for(int round=1;round<=4;round++)
			for(int i=0;i<4;i++)
				for(int j=0;j<3;j++){
					if(table[i][j]==0){
						table[i][j] = table[i][j+1];
						table[i][j+1] = 0;
					}
				}
		return table;
	}
	
	//Table right
	public static int[][] rightMove(int[][] table){
		for(int round=1;round<=4;round++)
			for(int i=0;i<4;i++)
				for(int j=3;j>0;j--){
					if(table[i][j]==0){
						table[i][j] = table[i][j-1];
						table[i][j-1] = 0;
					}
				}
		return table;		
	}
	
	
}

