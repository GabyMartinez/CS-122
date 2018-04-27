package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameGUI extends Application {
	private ComputerPlayer computerPlayer;
	private String computer = "O", user = "X";
	private Board board;

	
	private Rectangle one, two, three, four, five, six, seven, eight, nine;
	private Button startGame, newGame;
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Pane boardPane = new Pane();
	//	Pane sidePane = new Pane();
		
	//instructions and new game buttons
//		Label instructions = new Label("Click the box to make a move");
//		
	/*	startGame = new Button("Start Game");
		newGame = new Button("New Game");
		
		startGame.setOnAction(this::start);
		newGame.setOnAction(this::start);
//*/		
//		sidePane.getChildren().addAll(newGame);
		
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
	//	one.setOnMouseClicked(this::click);
		
		two.setOpacity(.5);
		two.setOnMouseEntered(this::hoverIn);
		two.setOnMouseExited(this::hoverOut);
	//	two.setOnMouseClicked(this::click);
		
		three.setOpacity(.5);
		three.setOnMouseEntered(this::hoverIn);
		three.setOnMouseExited(this::hoverOut);
		
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
		
		boardPane.setStyle("-fx-fill: #ADD8E6;");
		boardPane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine);
		root.setCenter(boardPane);
	//	root.setRight(sidePane);
		
		Scene GamePlay = new Scene(root,640,640);
		GamePlay.setFill(Color.BLACK);
		primaryStage.setScene(GamePlay);
		primaryStage.show();
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
		if(e.getSource()==one) {
			one.setOpacity(.5);
		}
		else if(e.getSource() == two) {
			two.setOpacity(.5);
		}
		else if(e.getSource() == three) {
			three.setOpacity(.5);
		}
		else if(e.getSource() == four) {
			four.setOpacity(.5);
		}
		else if(e.getSource() == five) {
			five.setOpacity(.5);
		}
		else if(e.getSource() == six) {
			six.setOpacity(.5);
		}
		else if(e.getSource() == seven) {
			seven.setOpacity(.5);
		}
		else if(e.getSource() == eight) {
			eight.setOpacity(.5);
		}
		else if(e.getSource() == nine) {
			nine.setOpacity(.5);
		}
	}
//	
/*	public void click(MouseEvent e) {
		boolean played = false;
		try {
			if(e.getSource()==one && ) {
				board.playMove(1, user);
				played = true;
			} 
			else if(e.getSource() == two && !played) {
				board.playMove(2, user);
				played = true;
			}
			else if(e.getSource() == three && !played) {
				board.playMove(3, user);
				played = true;
			}
			else if(e.getSource() == four && !played) {
				board.playMove(4, user);
				played = true;
			}
			else if(e.getSource() == five && !played) {
				board.playMove(5, user);
				played = true;
			}
			else if(e.getSource() == six && !played) {
				board.playMove(6, user);
				played = true;
			}
			else if(e.getSource() == seven && !played) {
				board.playMove(7, user);
				played = true;
			}
			else if(e.getSource() == eight && !played) {
				board.playMove(8, user);
				played = true;
			}
			else if(e.getSource() == nine && !played) {
				board.playMove(9, user);
				played = true;
			}
		}
		catch (IllegalMoveException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	*/
	public void start(ActionEvent e) {
		try {
			board = new Board("x");
			computerPlayer =  new ComputerPlayer(board);
		} 
		catch (StringNotAcceptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
