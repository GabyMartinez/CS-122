
public enum GameState { 
	PLAYING	(new int[][]{ {} }), //while not draw, x_won or o_won
	DRAW	(new int[][]{ {1,2,3,4,5,6,7,8,9} }), //filled board
	X_WON	(new int[][]{ {1,4,7}, {2,5,8}, {3,6,9}, {7,5,3}, {1,5,9}, {1,2,3}, {4,5,6}, {7,8,9} }), //ways x can win
	O_WON	(new int[][]{ {1,4,7}, {2,5,8}, {3,6,9}, {7,5,3}, {1,5,9}, {1,2,3}, {4,5,6}, {7,8,9} })  //ways o can win
	;
	//define each in RuleEngine
	private final int[][] movesList;
	
	private GameState(int[][]moves) {
		movesList = moves;
	}
	
	public int[][] getGameState(){
		return movesList;
	}

}
