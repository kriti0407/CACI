package caci.bricks.services.bricks_service.exceptions;


import java.util.HashMap;
import java.util.Map;

/**
 * Generic exception class for caci project
 
 */
public class BricksException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<Integer, String> errorMap = new HashMap<>();    
    private int code;
    private String message;
    
    public BricksException() {
    }
    
    public BricksException(String message) {
        super(message);
    }

        
    public BricksException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BricksException(int code, String message) {
        super(message);
        this.setCode(code);
        this.setMessage(message);        
    }
    
    public BricksException(int code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
        this.setMessage(message);
    }

    public BricksException(Throwable cause) {
        super(cause);
    }

    public BricksException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public BricksException(final Map<Integer, String> errorData) {
        this.setErrorMap(errorData);
    }  

    public Map<Integer, String> getErrorMap() {
        return errorMap;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrorMap(Map<Integer, String> errorMap) {
        this.errorMap = errorMap;
    }
    
}
