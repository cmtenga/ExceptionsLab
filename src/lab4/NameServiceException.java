/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Owner
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