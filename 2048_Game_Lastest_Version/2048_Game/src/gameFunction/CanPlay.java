package gameFunction;

public class CanPlay {
	static int[][] temp = new int[4][4];
	
	public static boolean canUp(int[][] table){
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				temp[i][j] = table[i][j];
		
		temp = Move.upMove(temp);
		temp = Combine.upCombine(temp);
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(temp[i][j]!=table[i][j])
					return true;
			
		return false;
	}

	public static boolean canDown(int[][] table) {

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				temp[i][j] = table[i][j];
		temp = Move.downMove(temp);
		temp = Combine.downCombine(temp);

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(temp[i][j]!=table[i][j])
					return true;
			
		return false;
	}

	public static boolean canLeft(int[][] table) {

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				temp[i][j] = table[i][j];
		temp = Move.leftMove(temp);
		temp = Combine.leftCombine(temp);

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(temp[i][j]!=table[i][j])
					return true;
			
		return false;
	}

	public static boolean canRight(int[][] table) {

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				temp[i][j] = table[i][j];
		temp = Move.rightMove(temp);
		temp = Combine.rightCombine(temp);

		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(temp[i][j]!=table[i][j])
					return true;
			
		return false;
	}
}
