package org.howard.edu.lsp.finalExam;

/**
 * 
 * This class implements the custom IntegerSetException exception
 * 
 * @author Javid Mitchell
 *
 */
public class NullMapException extends Exception {

	public NullMapException() {
		super("One or both maps are null!");
	}
	
	public NullMapException(String message) {
		super(message);
	}
}
