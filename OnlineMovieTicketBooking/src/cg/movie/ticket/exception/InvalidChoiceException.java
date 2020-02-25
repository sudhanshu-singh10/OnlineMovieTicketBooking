package cg.movie.ticket.exception;

public class InvalidChoiceException extends Exception {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;
	public InvalidChoiceException(String string) {
		this.string = string;
	}
	
	public String toString() {
		return "InvalidChoiceException[msg=" + string +"]";
	}
	
}
