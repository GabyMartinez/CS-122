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
	private ComputerPlayer computerPlayer;
	private TextField userName = new TextField();
	private String computer = "o", user = "x", username = userName.getText();
	
	private Board board = new Board(user);	
	private String [][] boardA = board.getBoard();
	private Game game;
	
	private Rectangle one, two, three, four, five, six, seven, eight, nine;
	private Button startGame, newGame;
	private Pane boardPane;
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
					instructions = new Label("Click a box to make a move");
	
	@Override
	public void start(Stage primaryStage) {
		
		
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
		//sidePane.setStyle("-fx-background-color: black;");
		
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
		move1.setStyle("-fx-font-size: 120pt;");
			move1.setOnMouseEntered(this::hoverIn);
			move1.setOnMouseExited(this::hoverOut);
			move1.setOnMouseClicked(this::click);

		move2.setText(""+boardA[0][1]);
		move2.setLayoutX(270);
		move2.setLayoutY(0);
		move2.setStyle("-fx-font-size: 120pt;");
			move2.setOnMouseEntered(this::hoverIn);
			move2.setOnMouseExited(this::hoverOut);
			move2.setOnMouseClicked(this::click);

		move3.setText(""+boardA[0][2]);
		move3.setLayoutX(480);
		move3.setLayoutY(0);
		move3.setStyle("-fx-font-size: 120pt;");
			move3.setOnMouseEntered(this::hoverIn);
			move3.setOnMouseExited(this::hoverOut);
			move3.setOnMouseClicked(this::click);


	//set fill	
		one.setFill(Color.LIGHTBLUE); // "-fx-fill: #ADD8E6; -fx-stroke: blue;");
		two.setFill(Color.LIGHTBLUE);
		three.setFill(Color.LIGHTBLUE);
		four.setFill(Color.LIGHTBLUE);
		five.setFill(Color.LIGHTBLUE);
		six.setFill(Color.LIGHTBLUE);
		seven.setFill(Color.LIGHTBLUE);
		eight.setFill(Color.LIGHTBLUE);
		nine.setFill(Color.LIGHTBLUE);
		
	//	set actions for clicks and hovers for each box
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
		
		five.setOpacity(.5);
		five.setOnMouseEntered(this::hoverIn);
		five.setOnMouseExited(this::hoverOut);
		
		six.setOpacity(.5);
		six.setOnMouseEntered(this::hoverIn);
		six.setOnMouseExited(this::hoverOut);
		
		seven.setOpacity(.5);
		seven.setOnMouseEntered(this::hoverIn);
		seven.setOnMouseExited(this::hoverOut);
		
		eight.setOpacity(.5);
		eight.setOnMouseEntered(this::hoverIn);
		eight.setOnMouseExited(this::hoverOut);
		
		nine.setOpacity(.5);
		nine.setOnMouseEntered(this::hoverIn);
		nine.setOnMouseExited(this::hoverOut);
		
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
//	
	
  	public void click(MouseEvent e) {
  		String [][] boardA = board.getBoard();
		try {
			
			if(e.getSource()==one && board.isValid(1)) { //&& Game.checkPlay()
				board.playMove(1, user);
				move1.setText(""+boardA[0][0]);
				boardPane.getChildren().add(move1);
				computerPlayer.setMove();
				setCompPlay();
			}
			else if(e.getSource() == two && board.isValid(2)) {
				board.playMove(2, user);
				move2.setText(""+boardA[0][1]);
				boardPane.getChildren().add(move2);
			}
			else if(e.getSource() == three && board.isValid(3)) {
				board.playMove(3, user);
				move3.setText(""+boardA[0][2]);
				boardPane.getChildren().add(move3);
			}
			
		}
		catch (IllegalMoveException e1) {
		//	instructions.setText(value);
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		}

	}
//	/*	
  	private void setCompPlay() {
  		move1.setText(""+boardA[0][2]);
  		move2.setText(""+boardA[0][2]);
  		move3.setText(""+boardA[0][2]);
  		move4.setText(""+boardA[0][2]);
  		move5.setText(""+boardA[0][2]);
  		move6.setText(""+boardA[0][2]);
  		move7.setText(""+boardA[0][2]);
  		move8.setText(""+boardA[0][2]);
  		move9.setText(""+boardA[0][2]);
  		boardPane.getChildren().addAll(move1, move2, move3, move4, move5, move6, move7, move8, move9);
  	}
//	*/
	
  	public void start(ActionEvent e) {
  		//	username ;
		
		//	board = new Board(user);
			computerPlayer =  new ComputerPlayer(board);
			game = new Game(computerPlayer);
			
			boardPane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine);
	  	//	boardPane.getChildren().addAll(move1, move2, move3, move4, move5, move6, move7, move8, move9);

			root.setCenter(boardPane);
			root.setBottom(sidePane);
			root.setTop(intro);
			startGame.setDisable(true);

			
	}
	public void newGame(ActionEvent e) {
		board = new Board(user);
		computerPlayer =  new ComputerPlayer(board);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
