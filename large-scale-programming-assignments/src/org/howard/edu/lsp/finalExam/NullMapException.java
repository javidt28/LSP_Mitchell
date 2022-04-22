package org.howard.edu.lsp.finalExam;

public class NullMapException extends Exception {

	public NullMapException() {
		super("One or both maps are null!");
	}
	
	public NullMapException(String message) {
		super(message);
	}
}
