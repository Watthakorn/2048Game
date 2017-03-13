package gameFunction;

public class Combine {
	private static int score = 0;

	//Combine up
	public static int[][] upCombine(int[][] table){
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++){
				if(table[i][j] == table[i+1][j]){
					table[i][j] += table[i+1][j];
					table[i+1][j] = 0;
				}
			}
		return table;
	}
	
	
	//Combine down
	public static int[][] downCombine(int[][] table){
		for(int i=3;i>0;i--)
			for(int j=0;j<4;j++){
				if(table[i][j] == table[i-1][j]){
					table[i][j] += table[i-1][j];
					table[i-1][j] = 0;
				}
			}
		return table;
	}
	
	//Combine left
	public static int[][] leftCombine(int[][] table){
		for(int i=0;i<4;i++)
			for(int j=0;j<3;j++){
				if(table[i][j] == table[i][j+1]){
					table[i][j] += table[i][j+1];
					table[i][j+1] = 0;
				}
			}
		return table;
	}
	
	//Combine right
	public static int[][] rightCombine(int[][] table){
		for(int i=0;i<4;i++)
			for(int j=3;j>0;j--){
				if(table[i][j] == table[i][j-1]){
					table[i][j] += table[i][j-1];
					table[i][j-1] = 0;
				}
			}
		return table;		
	}
	
	//Return score of combine
	public static int upScore(int[][] table){
		score = 0;
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				if(table[i][j] == table[i+1][j])
					score += 2*table[i+1][j];
	return score;
	
	}
	
	public static int downScore(int[][] table){
		score = 0;
		for(int i=3;i>0;i--)
			for(int j=0;j<4;j++)
				if(table[i][j] == table[i-1][j])
					score += 2*table[i-1][j];	
		return score;
	}
	
	public static int leftScore(int[][] table){
		score = 0;
		for(int i=0;i<4;i++)
			for(int j=0;j<3;j++)
				if(table[i][j] == table[i][j+1])
					score += 2*table[i][j+1];
		return score;
	}
	
	public static int rightScore(int[][] table){
		score = 0;
		for(int i=0;i<4;i++)
			for(int j=3;j>0;j--)
				if(table[i][j] == table[i][j-1])
					score += 2*table[i][j-1];
		return score;		
	}
}
