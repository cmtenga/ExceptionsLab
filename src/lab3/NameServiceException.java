package lab3;

/**
 *
 * @author Cecilia Mtenga, cmtenga@my.wctc.edu
 * @version 1.0
 */
public class NameServiceException extends Exception{
    private static final String ERR_MSG= "Error, only first and last name are "
            + " required, please try again";
   
    public NameServiceException(String message, Throwable cause){
        super(ERR_MSG, cause);
        
    }
    public NameServiceException(String message) {
        super(ERR_MSG);
    }

    public NameServiceException() {
        super(ERR_MSG);
    }

}
