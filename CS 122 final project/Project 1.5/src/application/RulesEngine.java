package application;

public interface RulesEngine {
	public boolean checkDraw();
	public boolean checkWinX();
	public boolean checkWinO();
	
	public default int[] movesMade(String[][] board, String letter) {
		int[]moves = new int[9];
		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				if(board[row][column].equalsIgnoreCase(letter)) {
					switch (row) {
			        case 0:	switch(column) {
						        case 0: 
						        	moves[0]=1;
						        	break;
						        case 1: 
						        	moves[1]=2;
						        	break;
						        case 2: 
						        	moves[2]=3;
						        	break;
			        		}
			                break;
			        case 1: switch(column) {
						        case 0: 
						        	moves[3]=4;
						        	break;
						        case 1: 
						        	moves[4]=5;
						        	break;
						        case 2: 
						        	moves[5]=6;
						        	break;
			        		}
			     			break;
			        case 2: switch(column) {
						        case 0: 
						        	moves[6]=7;
						        	break;
						        case 1: 
						        	moves[7]=8;
						        	break;
						        case 2: 
						        	moves[8]=9;
						        	break;
			        		}
			        		break;
			        default://throws IllegalMoveException
			        		break;
					}
				}
			}
		}
//		System.out.println("are moves made");
		return moves;
	}
	
}
