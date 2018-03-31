import java.util.Scanner;
public class Driver {
	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
				
		Board board = new Board("x");
	///*	
		board.printExampleBoard();
		System.out.println("\n");
		board.printBoard();
		System.out.println("\n");
		board.playMove(3);
		board.printBoard();
		board.playRandomMove();
		System.out.println("\n");
		board.printBoard();
	//*/
		board.checkBoard();
		
	}
}
