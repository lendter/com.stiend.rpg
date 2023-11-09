package Exceptions;

public class ArtifactUseException extends Exception {

	public ArtifactUseException() {
		super("Uses of the Artifact have been depleted");
	}

	public ArtifactUseException(String message) {
		super(message);
	}

	public ArtifactUseException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ArtifactUseException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ArtifactUseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
