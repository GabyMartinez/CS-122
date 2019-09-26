package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameGUI extends Application {
	private String computer = "o", user = "x";
	private Board board = new Board(user);
	private String [][] boardA = board.getBoard();
	private ComputerPlayer computerPlayer = new ComputerPlayer(board);
	private Game game = new Game(computerPlayer);
	private boolean isNewGame = false;
	
	private TextField userName = new TextField();
	private Rectangle one, two, three, four, five, six, seven, eight, nine;
	private Button startGame, newGame;
	private Pane boardPane, closingPane;
	private BorderPane root, sidePane, intro;
	private Label move1 = new Label(""), 
					move2 = new Label(""), 
					move3 = new Label(""), 
					move4 = new Label(""), 
					move5 = new Label(""), 
					move6 = new Label(""), 
					move7 = new Label(""), 
					move8 = new Label(""), 
					move9 = new Label(""), 
					instructions = new Label("Click a box to make a move"),
					winnings;
	
	@Override
	public void start(Stage primaryStage) {
		
		closingPane = new Pane();
		root = new BorderPane();
		sidePane = new BorderPane();
		intro = new BorderPane();
		boardPane = new Pane();
		GridPane startPane = new GridPane();
		
	//instructions and new game buttons
	//Label instructions = new Label("Click the box to make a move");
		Label addUserName = new Label("Enter Username\t");
		
//	/*	
	// TODO add buttons later for light or dark themes
		startGame = new Button("Start Game");
		newGame = new Button("New Game");
//*/		
		startGame.setOnAction(this::start);
		startGame.setStyle("-fx-font-size: 14pt;");
		
		newGame.setOnAction(this::newGame);
//		newGame.setStyle(value);
		
		instructions.setStyle("-fx-font-size: 12pt;");
		intro.setCenter(instructions);		
		
	//	add all nodes to startPane/start page	
	//	startPane.getChildren().addAll(instructions,startGame);
	//	startPane.add(instructions, 1, 1);
		startPane.add(addUserName, 1, 2);
		startPane.add(userName, 2, 2);
		startPane.add(startGame, 2, 4);
		startPane.setAlignment(Pos.CENTER);
		addUserName.setStyle("-fx-font-size: 14pt;");
		
	//add newGame button to sidePane to later add to root
		sidePane.setCenter(newGame);
		//TODO dark theme
		//sidePane.setStyle("-fx-background-color: black;");
		
	//TODO Closing Pane/end game card
		winnings = new Label("");
		winnings.setLayoutX(150);
		winnings.setLayoutY(150);
		winnings.setStyle("-fx-font-size: 50pt;");
		closingPane.setStyle("-fx-background-color: #ADD8E6");
	//	closingPane.setOpacity(.7);
	//	closingPane.getChildren().add(winnings);
		
		//boxes for each choice
		one = new Rectangle(10,10,200,200);
		two = new Rectangle(220,10,200,200);
		three = new Rectangle(430,10,200,200);
		four = new Rectangle(10,220,200,200);
		five = new Rectangle(220,220,200,200);
		six = new Rectangle(430,220,200,200);
		seven = new Rectangle(10,430,200,200);
		eight = new Rectangle(220,430,200,200);
		nine = new Rectangle(430,430,200,200);
	
	//set layout for x and o's	
		move1.setText(""+boardA[0][0]);
		move1.setLayoutX(55);
		move1.setLayoutY(0);
		move1.setStyle("-fx-font-size: 0pt;");
	/*		move1.setOnMouseClicked((e)-> {one.setOpacity(1);});
			move1.setOnMouseEntered(this::hoverIn);
			move1.setOnMouseExited(this::hoverOut);
			move1.setOnMouseClicked(this::click);
	*/
		move2.setText(""+boardA[0][1]);
		move2.setLayoutX(270);
		move2.setLayoutY(0);
		move2.setStyle("-fx-font-size: 0pt;");
		

		move3.setText(""+boardA[0][2]);
		move3.setLayoutX(480);
		move3.setLayoutY(0);
		move3.setStyle("-fx-font-size: 0pt;");
		
		move4.setText(""+boardA[1][0]);
		move4.setLayoutX(55);
		move4.setLayoutY(205);
		move4.setStyle("-fx-font-size: 0pt;");
		
		move5.setText(""+boardA[1][1]);
		move5.setLayoutX(270);
		move5.setLayoutY(205);
		move5.setStyle("-fx-font-size: 0pt;");
		
		move6.setText(""+boardA[1][2]);
		move6.setLayoutX(480);
		move6.setLayoutY(205);
		move6.setStyle("-fx-font-size: 0pt;");
		
		move7.setText(""+boardA[2][0]);
		move7.setLayoutX(55);
		move7.setLayoutY(415);
		move7.setStyle("-fx-font-size: 0pt;");
		
		move8.setText(""+boardA[2][1]);
		move8.setLayoutX(270);
		move8.setLayoutY(415);
		move8.setStyle("-fx-font-size: 0pt;");
		
		move9.setText(""+boardA[2][2]);
		move9.setLayoutX(480);
		move9.setLayoutY(415);
		move9.setStyle("-fx-font-size: 0pt;");

	//set fill for rectangles	
		one.setFill(Color.LIGHTBLUE); // "-fx-fill: #ADD8E6; -fx-stroke: blue; rgba(173,216,230,.5);");
		two.setFill(Color.LIGHTBLUE);
		three.setFill(Color.LIGHTBLUE);
		four.setFill(Color.LIGHTBLUE);
		five.setFill(Color.LIGHTBLUE);
		six.setFill(Color.LIGHTBLUE);
		seven.setFill(Color.LIGHTBLUE);
		eight.setFill(Color.LIGHTBLUE);
		nine.setFill(Color.LIGHTBLUE);
		
	//	set actions for clicks and hovers for each box
	/*	one = new Pane();
		one.setStyle("-fx-background-color: #ADD8E6");
	    one.setScaleX(10);
	    one.setScaleY(10);
	    one.setMaxSize(200, 200);
	    one.getChildren().add(move1);
	*/
		one.setOpacity(.5);
		one.setOnMouseEntered(this::hoverIn);
		one.setOnMouseExited(this::hoverOut);
			one.setOnMouseClicked(this::click);
		
		two.setOpacity(.5);
		two.setOnMouseEntered(this::hoverIn);
		two.setOnMouseExited(this::hoverOut);
			two.setOnMouseClicked(this::click);
		
		three.setOpacity(.5);
		three.setOnMouseEntered(this::hoverIn);
		three.setOnMouseExited(this::hoverOut);
			three.setOnMouseClicked(this::click);
		
		four.setOpacity(.5);
		four.setOnMouseEntered(this::hoverIn);
		four.setOnMouseExited(this::hoverOut);
			four.setOnMouseClicked(this::click);
		
		five.setOpacity(.5);
		five.setOnMouseEntered(this::hoverIn);
		five.setOnMouseExited(this::hoverOut);
			five.setOnMouseClicked(this::click);
		
		six.setOpacity(.5);
		six.setOnMouseEntered(this::hoverIn);
		six.setOnMouseExited(this::hoverOut);
			six.setOnMouseClicked(this::click);
		
		seven.setOpacity(.5);
		seven.setOnMouseEntered(this::hoverIn);
		seven.setOnMouseExited(this::hoverOut);
			seven.setOnMouseClicked(this::click);
		
		eight.setOpacity(.5);
		eight.setOnMouseEntered(this::hoverIn);
		eight.setOnMouseExited(this::hoverOut);
			eight.setOnMouseClicked(this::click);
		
		nine.setOpacity(.5);
		nine.setOnMouseEntered(this::hoverIn);
		nine.setOnMouseExited(this::hoverOut);
			nine.setOnMouseClicked(this::click);
		
//		boardPane.setStyle("-fx-background-color: black;");
//		boardPane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine);
		root.setCenter(startPane);
		root.setPadding(new Insets(3, 0, 10, 0));
//		root.setStyle("-fx-background-color: black;");
	
		
		Scene GamePlay = new Scene(root,640,700);
		GamePlay.setFill(Color.BLACK);		
		primaryStage.setScene(GamePlay);
		primaryStage.setResizable(false);
		primaryStage.show();
	
	/*	Scene startScreen = new Scene(sidePane, 300,200);
		Stage startStage = new Stage();
		startStage.setScene(startScreen);
		startStage.show();
	*/
	}
	
	public void hoverIn(MouseEvent e) {
		//highlights when mouse hovers over box
		if(e.getSource() == one) {
			one.setOpacity(1);
		}
		else if(e.getSource() == two) {
			two.setOpacity(1);
		}
		else if(e.getSource() == three) {
			three.setOpacity(1);
		}
		else if(e.getSource() == four) {
			four.setOpacity(1);
		}
		else if(e.getSource() == five) {
			five.setOpacity(1);
		}
		else if(e.getSource() == six) {
			six.setOpacity(1);
		}
		else if(e.getSource() == seven) {
			seven.setOpacity(1);
		}
		else if(e.getSource() == eight) {
			eight.setOpacity(1);
		}
		else if(e.getSource() == nine) {
			nine.setOpacity(1);
		}
	}
//	
	public void hoverOut(MouseEvent e) {
		//returns to normal/dimmed
		if(e.getSource()==one && board.isValid(1)) {
			one.setOpacity(.5);
		}
		else if(e.getSource() == two && board.isValid(2)) {
			two.setOpacity(.5);
		}
		else if(e.getSource() == three && board.isValid(3)) {
			three.setOpacity(.5);
		}
		else if(e.getSource() == four && board.isValid(4)) {
			four.setOpacity(.5);
		}
		else if(e.getSource() == five && board.isValid(5)) {
			five.setOpacity(.5);
		}
		else if(e.getSource() == six && board.isValid(6)) {
			six.setOpacity(.5);
		}
		else if(e.getSource() == seven && board.isValid(7)) {
			seven.setOpacity(.5);
		}
		else if(e.getSource() == eight && board.isValid(8)) {
			eight.setOpacity(.5);
		}
		else if(e.getSource() == nine && board.isValid(9)) {
			nine.setOpacity(.5);
		}
	}

  	public void click(MouseEvent e) {
  		String [][] boardA;
  		if(isNewGame) {
  			board = new Board(user);
			boardA = board.getBoard(); 
			computerPlayer = new ComputerPlayer(board);
			game = new Game(computerPlayer);
  		}
  		boardA = board.getBoard();
  		
  		if(isNewGame)
			root.requestLayout();
		try {
			//do {
				if(e.getSource()==one && board.isValid(1) && game.checkPlay()) { //&& Game.checkPlay()
					board.playMove(1, user);
					move1.setText(""+boardA[0][0]);
					move1.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
					
					if(isNewGame)
						root.requestLayout();
				}
				else if(e.getSource() == two && board.isValid(2) && game.checkPlay()) {
					board.playMove(2, user);
					move2.setText(""+boardA[0][1]);
					move2.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == three && board.isValid(3) && game.checkPlay()) {
					board.playMove(3, user);
					move3.setText(""+boardA[0][2]);
					move3.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == four && board.isValid(4) && game.checkPlay()) {
					board.playMove(4, user);
					move4.setText(""+boardA[1][0]);
					move4.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				
				else if(e.getSource() == five && board.isValid(5) && game.checkPlay()) {
					board.playMove(5, user);
					move5.setText(""+boardA[1][1]);
					move5.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == six && board.isValid(6) && game.checkPlay()) {
					board.playMove(6, user);
					move6.setText(""+boardA[1][2]);
					move6.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == seven && board.isValid(7) && game.checkPlay()) {
					board.playMove(7, user);
					move7.setText(""+boardA[2][0]);
					move7.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == eight && board.isValid(8) && game.checkPlay()) {
					board.playMove(8, user);
					move8.setText(""+boardA[2][1]);
					move8.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
				else if(e.getSource() == nine && board.isValid(9) && game.checkPlay()) {
					board.playMove(9, user);
					move9.setText(""+boardA[2][2]);
					move9.setStyle("-fx-font-size: 120pt;");
					if(game.checkPlay()) {
						computerPlayer.setMove();
						setCompPlay();
					}
				}
		//	} while(game.checkPlay());
			
			if(game.checkWinX()) {
				String name = userName.getText();
		/*		if(name == "" || name == " ") {
					winnings.setText("You Win!");
				}
				else
		*/	
				winnings.setText("You Win!");
					
			//	System.out.print("You Win!");
			
				StackPane pane = new StackPane();
				pane.getChildren().addAll(closingPane, winnings);
				root.setCenter(pane);
			}
			else if(game.checkWinO()) {
				winnings.setText("The Computer Wins!\nBetter Luck next time!");
			//	System.out.println("The Computer Wins! Better Luck next time!");
				
				StackPane pane = new StackPane();
				pane.getChildren().addAll(closingPane, winnings);
				root.setCenter(pane);
			}
			else if(game.checkDraw()) {
				winnings.setText("It's a Draw!");
			//	System.out.print("It's a Draw!");
				
				StackPane pane = new StackPane();
				pane.getChildren().addAll(closingPane, winnings);
				root.setCenter(pane);
			}
			
			
		}
		catch (IllegalMoveException e1) {
		//	instructions.setText(value);
		//	e1.printStackTrace();
		}

	}
//	/*	
  	private void setCompPlay() {
  		for(int row = 0; row<3; row++) {
			for(int column = 0; column<3;column++) {
				if(boardA[row][column]!= "  ") { 
					switch (row) {
			        case 0:	switch(column) {
						        case 0: 
						        //	System.out.print(" 1 ");
						        	move1.setText(""+boardA[0][0]);
						        	move1.setStyle("-fx-font-size: 120pt;");
						        	one.setOpacity(1);
						        	break;
						        case 1: 
						        	move2.setText(""+boardA[0][1]);
						        	move2.setStyle("-fx-font-size: 120pt;");
						        	two.setOpacity(1);
						        //	System.out.print(" 2 ");
						        	break;
						        case 2: 
						        	move3.setText(""+boardA[0][2]);
						        	move3.setStyle("-fx-font-size: 120pt;");
						        	three.setOpacity(1);
						        //	System.out.print(" 3 ");
						        	break;
			        		}
			                break;
			        case 1: switch(column) {
						        case 0: 
						        	move4.setText(""+boardA[1][0]);
						        	move4.setStyle("-fx-font-size: 120pt;");
						        	four.setOpacity(1);
						        //	System.out.print(" 4 ");
						        	break;
						        case 1: 
						        	move5.setText(""+boardA[1][1]);
						        	move5.setStyle("-fx-font-size: 120pt;");
						        	five.setOpacity(1);
						        //	System.out.print(" 5 ");
						        	break;
						        case 2: 
						        	move6.setText(""+boardA[1][2]);
						        	move6.setStyle("-fx-font-size: 120pt;");
						        	six.setOpacity(1);
						        //	System.out.print(" 6 ");
						        	break;
			        		}
			     			break;
			        case 2: switch(column) {
						        case 0: 
						        	move7.setText(""+boardA[2][0]);
						        	move7.setStyle("-fx-font-size: 120pt;");
						        	seven.setOpacity(1);
						        //	System.out.print(" 7 ");
						        	break;
						        case 1: 
						        	move8.setText(""+boardA[2][1]);
						        	move8.setStyle("-fx-font-size: 120pt;");
						        	eight.setOpacity(1);
						        //	System.out.print(" 8 ");
						        	break;
						        case 2: 
						        	move9.setText(""+boardA[2][2]);
						        	move9.setStyle("-fx-font-size: 120pt;");
						        	nine.setOpacity(1);
						        //	System.out.print(" 9 ");
						        	break;
			        		}
			        		break;
					}
				}
			}
		}
   	//	boardPane.getChildren().addAll(move1, move2, move3, move4, move5, move6, move7, move8, move9);
  	}
  	
//	*/	
  	public void start(ActionEvent e) {
  		//	username ;
		
		//	board = new Board(user);
		//	computerPlayer =  new ComputerPlayer(board);
		//	game = new Game(computerPlayer);
			
			boardPane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine);
	  		boardPane.getChildren().addAll(move1, move2, move3, move4, move5, move6, move7, move8, move9);

			root.setCenter(boardPane);
			root.setBottom(sidePane);
			root.setTop(intro);
			startGame.setDisable(true);

			
	}
	public void newGame(ActionEvent e) {
		root.setCenter(boardPane);
		boardPane.requestLayout();
		board = new Board(user);
		computerPlayer =  new ComputerPlayer(board);
		game = new Game(computerPlayer);
		
		move1.setText("");
		move2.setText("");
		move3.setText("");
		move4.setText("");
		move5.setText("");
		move6.setText("");
		move7.setText("");
		move8.setText("");
		move9.setText("");
		
		move1.setStyle("-fx-font-size: 0pt;");
		move2.setStyle("-fx-font-size: 0pt;");
		move3.setStyle("-fx-font-size: 0pt;");
		move4.setStyle("-fx-font-size: 0pt;");
		move5.setStyle("-fx-font-size: 0pt;");
		move6.setStyle("-fx-font-size: 0pt;");
		move7.setStyle("-fx-font-size: 0pt;");
		move8.setStyle("-fx-font-size: 0pt;");
		move9.setStyle("-fx-font-size: 0pt;");
		
		one.setOpacity(.5);
		two.setOpacity(.5);
		three.setOpacity(.5);
		four.setOpacity(.5);
		five.setOpacity(.5);
		six.setOpacity(.5);
		seven.setOpacity(.5);
		eight.setOpacity(.5);
		nine.setOpacity(.5);
		
		
		isNewGame = true;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
