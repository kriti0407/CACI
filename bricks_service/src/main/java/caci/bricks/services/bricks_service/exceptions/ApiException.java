package caci.bricks.services.bricks_service.exceptions;

/**
*
*custom class for Exception.
*/
public class ApiException extends BricksException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    } 
}
