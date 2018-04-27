package application;
import java.util.Scanner;
public class Game implements RulesEngine
{
	private ComputerPlayer computerPlayer;
	private String computer, user;
	private Board board;
	Scanner scan = new Scanner(System.in);

	public Game(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
	//	computer = computerPlayer.getComputerSymbol();
		board = computerPlayer.getBoard();
		user = board.getUserSymbol();
	}
	private void setUser() throws StringNotAcceptedException {
		user = "x";
		board.setUserSymbol(user);
		
		computer = "o";
		board.setComputerSymbol(computer);
	/*/	System.out.println("Do you want to be X or O?");
	//	user = scan.nextLine();
		if(user.equalsIgnoreCase("x")) {
			board.setUserSymbol(user);
			user = board.getUserSymbol();
			
			board.setComputerSymbol("o");
			computer = board.getComputerSymbol();
		}
		else if(user.equalsIgnoreCase("o")) {
			board.setUserSymbol(user);
			user = board.getUserSymbol();
			
			board.setComputerSymbol("x");
			computer = board.getComputerSymbol();
		}
		else throw new StringNotAcceptedException("Enter X or O");
	*/
	}
	
	private void promptUser() {
		try {
			System.out.println("Enter a number between 1 and 9 (inclusive)" +
					" or enter R for a random move");
			System.out.println("(need help? enter E for an example board)");
			System.out.println("(enter H for a list of possible moves)");
			
			String input = scan.nextLine();
			
			if(input.equalsIgnoreCase("R")) {
				board.playRandomMove();
			}
			else if(input.equalsIgnoreCase("E")) {
				board.printExampleBoard();
				promptUser();
			}
			else if(input.equalsIgnoreCase("H")) {
				board.checkBoard();
				promptUser();
			}
			else if(isNumeric(input)) {
				board.playMove(Integer.parseInt(input), user);
			}
			else 
				throw new StringNotAcceptedException("Sorry. Not what we're looking for. Try a number!");
		
		}
		catch(StringNotAcceptedException e) {
			System.out.println(e.getMessage());
			promptUser();
		}
		catch(IllegalMoveException e) {
			System.out.println(e.getLocalizedMessage());
			promptUser();
		}
	}
	
	private static boolean isNumeric(String s) {
		int count=0;
		boolean num = false;
		while(s.length()>count) {
			char c = s.charAt(count);
			 if(Character.isDigit(c)) {
				 num = true;
			 }
			 count++;
		}
		return num;
	}

	public boolean checkDraw() {
	/*	try {
		board.checkBoard();
		return false;
		}
		catch(IllegalMoveException e) {
			return true;
		}
	*/	
		int [] movesX = movesMade(board.getBoard(), user);
		int [] movesO = movesMade(board.getBoard(), computer);
		GameState state = GameState.DRAW;
		int [][] draw = state.getGameState();
		int count = 0;
		
		for(int i = 0; draw[0].length>i;i++) {
			for(int moveX:movesX) {
				if(draw[0][i]==moveX)
					count++;
			}
			for(int moveO:movesO) {
				if(draw[0][i]==moveO)
					count++;
			}
		}
		
		if(count==9)
			return true;
		else
			return false;
	}
	
	public boolean checkPlay() {
		if(checkDraw())
			return false;
		else if(checkWinX())
			return false;
		else if(checkWinO())
			return false;
		else 
			return true;
	}
	
	public boolean checkWinO() {
		GameState state = GameState.O_WON;
		int[][] xWin = state.getGameState();
		int[] moves = movesMade(board.getBoard(), (computer.equalsIgnoreCase("o")?computer:"x"));
		
		for(int row = 0; row < 8; row++) {
			int count = 0;
			for(int col=0;col < 3;col++) {
				for(int move:moves) {
					if(xWin[row][col]==move)
						count++;
				}
			}
			if(count==3) {
			//	System.out.println("Computer Wins");
				return true;
			}
		}
		return false;
	}
	
	public boolean checkWinX() {
		GameState state = GameState.X_WON;
		int[][] xWin = state.getGameState();
		int[] moves = movesMade(board.getBoard(), (user.equalsIgnoreCase("x")?user:"o"));
		
		for(int row = 0; row < 8; row++) {
			int count = 0;
			for(int col=0;col < 3;col++) {
				for(int move:moves) {
					if(xWin[row][col]==move)
						count++;
				}
			}
			if(count==3)
		//		System.out.print("You Win!");
				return true;
		}
		return false;
	}
	
	
	public int[] movesMade(String[][] board, String letter) {
		int[]moves = new int[9];
		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				if(board[row][column].equalsIgnoreCase(letter)) {
					switch (row) {
			        case 0:	switch(column) {
						        case 0: 
						        	moves[0]=1;
						        //	System.out.print(1 );
						        	break;
						        case 1: 
						        	moves[1]=2;
						        //	System.out.print( 2 );
						        	break;
						        case 2: 
						        	moves[2]=3;
						       // 	System.out.print( 3 );
						        	break;
			        		}
			                break;
			        case 1: switch(column) {
						        case 0: 
						        	moves[3]=4;
						        //	System.out.print( 4 );
						        	break;
						        case 1: 
						        	moves[4]=5;
						        //	System.out.print( 5 );
						        	break;
						        case 2: 
						        	moves[5]=6;
						        //	System.out.print( 6 );
						        	break;
			        		}
			     			break;
			        case 2: switch(column) {
						        case 0: 
						        	moves[6]=7;
						       // 	System.out.print( 7 );
						        	break;
						        case 1: 
						        	moves[7]=8;
						        //	System.out.print( 8 );
						        	break;
						        case 2: 
						        	moves[8]=9;
						        //	System.out.print( 9 );
						        	break;
			        		}
			        		break;
			        default://throws IllegalMoveException
			        		break;
					}
				}
			}
		}
	//	System.out.println(" are moves made");
	
		
		return moves;
	}
	
	
	public void play() {
		//try-catch for illegal moves and inputs
		try {
			setUser();
			board.printBoard();
			while(checkPlay()) {
				
				promptUser();
				
				if(!checkPlay()) {
					board.printBoard();
					break;
				}
				
				computerPlayer.setMove();
				board.printBoard();
			//	computerPlayer.printCompMove(); //not working
			}
						
			if(checkWinX())
				System.out.print("You Win!");
			else if(checkWinO()) {
				System.out.println("The Computer Wins! Better Luck next time!");
				System.out.println("Want to try again? y/n");
				String input = scan.nextLine();
				
				if(input.equalsIgnoreCase("y")) {
					board = new Board("x");
					computerPlayer = new ComputerPlayer(board);
					play();
				}
			}
			else if(checkDraw()) {
				System.out.print("It's a Draw!");
			}
		
		}
		catch(IllegalMoveException ex) {
			System.out.println(ex.getLocalizedMessage());
			play();
		}
		catch (StringNotAcceptedException e) {
			System.out.println(e.getLocalizedMessage());
			
			play();
		}
		

	}

}
