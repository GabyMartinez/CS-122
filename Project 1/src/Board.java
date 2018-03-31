import java.util.Random;
public class Board {
	protected String user, computer;
//	String o = "O"; computer for my own benefit, delete later
	private int row, column;
	private String row2 = "-----------";
	private String board [][] = new String[3][3];
//	private final int SPOT[] = {1,2,3,4,5,6,7,8,9};
	
	public Board(String letter) {
		//initialize
		//sets user & computer letter
		if (letter.equalsIgnoreCase("x")) {
			user = "X";
			computer = "O";
		}
		else if (letter.equalsIgnoreCase("o")) {
			user = "O";
			computer = "X";
		}
		//sets the board to 2 spaces
		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				board[row][column] = "  ";
			}
		}
		row = 0;
		column = 0;
	}
/*	public String newBoard() {
		String row1 = "\t|\t|\t";
	//	String row2 = "-------------";	
		return row1 + "\n" + row2 + "\n" + row1 + "\n" + row2 + "\n" + row1;
	}
*/
	
	public void printBoard() {
		//board updates?
	/*	for(String board : board[0]) 
			System.out.print(board + (board.contentEquals("\t")?"|":" | "));
		
		//print row2, repeat with next row
		System.out.println("\n"+row2);
		for(String board : board[1]) 
			System.out.print(board + (board.contentEquals("\t")?"|":" | "));
		
		System.out.println("\n"+row2);
		for(String board : board[2]) 
			System.out.print(board + (board.contentEquals("\t")?"|":" | "));
	*/		
		String row1 = (board[0][0].contentEquals("  ")?"":" ") + board[0][0] + " | " + board[0][1] + (board[0][1].contentEquals("  ")?"| ":" | ") + board[0][2];
		String row3 = (board[1][0].contentEquals("  ")?"":" ") + board[1][0] + " | " + board[1][1] + (board[1][1].contentEquals("  ")?"| ":" | ") + board[1][2];
		String row5 = (board[2][0].contentEquals("  ")?"":" ") + board[2][0] + " | " + board[2][1] + (board[2][1].contentEquals("  ")?"| ":" | ") + board[2][2];
		String result = row1 + "\n" + row2 + "\n" + row3 + "\n" + row2 + "\n" + row5;
		System.out.print(result);
	}
	public void printExampleBoard(){
	
		String row1 = " 1 | 2 | 3";
		String row3 = " 4 | 5 | 6";
		String row5 = " 7 | 8 | 9";
		String result = row1 + "\n" + row2 + "\n" + row3 + "\n" + row2 + "\n" + row5;
		System.out.print("Example Board:\n"+result);
	}
		
	
	protected boolean isValid(int row, int column) {
		boolean isValid = false;
		
		if(board[row][column].equals("  "))
			isValid= true;
		return isValid;
	}
	
	public void checkBoard() {
		System.out.print("\nMoves:");
		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				if(board[row][column] == "  ") {
					switch (row) {
			        case 0:	switch(column) {
						        case 0: 
						        	System.out.print(" 1 ");
						        	break;
						        case 1: 
						        	System.out.print(" 2 ");
						        	break;
						        case 2: 
						        	System.out.print(" 3 ");
						        	break;
			        		}
			                break;
			        case 1: switch(column) {
						        case 0: 
						        	System.out.print(" 4 ");
						        	break;
						        case 1: 
						        	System.out.print(" 5 ");
						        	break;
						        case 2: 
						        	System.out.print(" 6 ");
						        	break;
			        		}
			     			break;
			        case 2: switch(column) {
						        case 0: 
						        	System.out.print(" 7 ");
						        	break;
						        case 1: 
						        	System.out.print(" 8 ");
						        	break;
						        case 2: 
						        	System.out.print(" 9 ");
						        	break;
			        		}
			        		break;
			        default://throws IllegalMoveException
			        		break;
					}
				}
			}
		}
		System.out.print("are valid moves");
	}
/*	public void checkBoard() {//original
		//String result = "";
		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				if(board[row][column] == "  ")
					System.out.println("\nMove: row=" + (row+1) + ", column=" + (column+1) + " is a valid move");
			}
		}
		//return result;
	}
*/
	
	public void playRandomMove() {
		Random generator = new Random();
		row = generator.nextInt(3);
		column = generator.nextInt(3);
		if(isValid(row, column))
			board[row][column] = user;
		else {//iterates until finds a valid move	
			while(!(isValid(row, column))) { 
			row = generator.nextInt(3);
			column = generator.nextInt(3);
			}
			board[row][column] = user;
		}
	}
	
	//going to change to a private setter method
	//input will be one number 1-9
	private void setMove(int row, int column) {
		board[row][column] = user;
	}
	
	//switch statement to interpret spot input
	public void playMove(int move) {
		//compares input and assigns to a move (private method setMove())
		
		switch (move) {
        case 1:	row = 0;
        		column = 0;
        		setMove(0,0);
                break;
        case 2: row = 0;
      			column = 1;
        		setMove(0,1);
     			break;
        case 3: row = 0;
        		column = 2;
        		setMove(0,2);
        		break;
        case 4: row = 1;
        		column = 0;
        		setMove(1,0);
        		break;
        case 5: row = 1;
        		column = 1;
        		setMove(1,1);
        		break;
        case 6: row = 1;
				column = 2;
				setMove(1,2);
				break;
        case 7: row = 2;
        		column = 0;
        		setMove(2,0);
				break;
        case 8: row = 2;
				column = 1;
				setMove(2,1);
				break;
        case 9: row = 2;
        		column = 2;
        		setMove(2,2);
        		break;	
        default://default throws IllegalMoveException
        		break;
		}
	}
}
