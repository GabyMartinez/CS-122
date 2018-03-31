import java.util.Scanner;
public class Game {
	private ComputerPlayer computerPlayer;
	private String computer, user;
	private Board board;
	Scanner scan = new Scanner(System.in);

	public Game(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
		computer = computerPlayer.getComputerSymbol();
		board = computerPlayer.getBoard();
	}
	private void setUser() throws StringNotAcceptedException {
		System.out.println("Do you want to be X or O?");
		user = scan.nextLine();
		board.setUserSymbol(user);
	}
	
	private void promptUser() {
		try {
		System.out.println("Enter a number between 1 and 9 (inclusive)" +
				" or enter R for a random move");
		System.out.println("(need help? enter E for an example board)");
		System.out.println("(enter H for a list of possible moves)");
		
		String input = scan.nextLine();
		
		if(input.equalsIgnoreCase("R"))
			board.playRandomMove();
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
	
	public void play() {
		//try-catch for illegal moves and inputs
		try {
		setUser();
		
		//while enum == play
		
		if(user.equalsIgnoreCase("X")) {
			promptUser();
		}
		else
			computerPlayer.setMove();
		
		board.printBoard();
		}
		catch(IllegalMoveException ex) {
			System.out.println(ex.getLocalizedMessage());
			play();
		}
		catch (StringNotAcceptedException e) {
			System.out.println(e.getLocalizedMessage());
			play();
		}
		
		//once out of the loop 
	}

}
