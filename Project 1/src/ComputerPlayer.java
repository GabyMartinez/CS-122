
public class ComputerPlayer{

/*	private int[][] preferredMoves = {
	         {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2},
	         {0, 1}, {1, 0}, {1, 2}, {2, 1}};
*/	
	private int[] moves = {5,1,3,7,2,4,6,8};

	   private Board board;
	   private String compBoard [][];
	   private String computer; 
	   
	   //----- YOUR CODE GOES HERE:
	   // ADDED INSTANCE VARIABLE THAT STORES THE GAME SYMBOL ASSIGNED TO THE COMPUTER PLAYER
	   		//taken care of in Board class
	  
	   /** Constructor with reference to game board */
	   public ComputerPlayer(Board board) 
	   {
	      this.board = board;
	      compBoard = board.getBoard();
	      computer = board.getComputerSymbol();
	   }
	 
	 	//----- YOUR CODE GOES HERE:
	 	// ADD A SETTTER METHOD FOR THE INSTANCE VARIABLE THAT 
	    // STORES THE GAME SYMBOL ASSIGNED TO THE COMPUTER PLAYER
	   public void setComputerSymbol(String letter) {
		   board.setComputerSymbol(letter);
	   }
	   public String getComputerSymbol() {
		   return board.getComputerSymbol();
	   }
	   public Board getBoard() {
		   return board;
	   }
	   
	   /** Search for the first empty cell, according to the preferences
	    *  @return int array of two values [row, col]
	    */
/*	
 	   public int[] generateMove() 
	   {//original
	   		 for (int[] move : preferredMoves) 
	   		 {
	   		 	 // checks for empty space on board 
	   		 	 // (i.e. checks if this "move" is available, if the space is empty its available)
		         if (this.compBoard[move[0]][move[1]] == " ") 
		         {
		            return move;
		         }
	         }

	         return null;
	   }
 */	   
	   
 	   private int getMove() {
 		   for (int move : moves) {
 			   if(board.isValid(move))
 				   return move;
 		   }
 		   return 0;
 	   }
 	   
 	   
 	   public void setMove() throws IllegalMoveException {
 		   //only call if getMove()!= 0
		   if(getMove()!= 0) {
			  this.board.playMove(getMove(),computer);
		   }
		   //else do nothing or random move
	   }
	   

}
