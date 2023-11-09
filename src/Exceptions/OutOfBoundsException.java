package Exceptions;

public class OutOfBoundsException extends Exception {

	public OutOfBoundsException() {
		super("The space you want to move to is not part of the map");
	}

	public OutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OutOfBoundsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public OutOfBoundsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OutOfBoundsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
