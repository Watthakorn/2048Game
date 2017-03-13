package gameFunction;

public class GameEnd {
	//return true if game isn'i end, false if game is end.
	public static boolean isGameEnd(int[][] table){
		if(CanPlay.canUp(table) || CanPlay.canDown(table) || CanPlay.canLeft(table) || CanPlay.canRight(table))
			return true;
		return false;
	}
	
	//Check win
	public static boolean beatGame(int[][] table){
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(table[i][j]>=2048)
					return true;
		return false;
	}

}
