package application;

public class IllegalMoveException extends Exception
{
	public IllegalMoveException(String message) {
		System.out.println(message);
	}
}
