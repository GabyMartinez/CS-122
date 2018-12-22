package application;
//import java.util.Scanner;
public class Driver {
	public static void main(String[]args) throws StringNotAcceptedException, IllegalMoveException {
	//	Scanner scan = new Scanner(System.in);
		
	//	String letter = scan.next();
		Board board= new Board("x");
		ComputerPlayer computer =  new ComputerPlayer(board);
		Game game = new Game(computer);
/*		
		board.printExampleBoard();
		System.out.println("\n");
		board.printBoard();
		System.out.println("\n");
		board.playMove(5,"x");
		board.printBoard();
		System.out.println("\n");
		
		board.playRandomMove();
	
		computer.setMove();
		board.printBoard();
		
		System.out.println("\n");
		board.checkBoard();
		System.out.print("\n"+board.isValid(9));
*/
		game.play();
	}
}
