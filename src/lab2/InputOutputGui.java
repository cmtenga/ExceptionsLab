package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Cecilia Mtenga, cmtenga@my.wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private static final String ERR_MSG= "Error, only first and last name are "
            + " required, please try again";
    private static final String MSG_TITLE = "Input Error";
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        
        if (fullName == null){
            
            System.exit(0);
        }
        
        String lastName = "Unknown";
        String firstName = "Unknown";
        try{
            
         lastName = nameService.extractLastName(fullName);
        firstName = nameService.extractFirstName(fullName);
      
        } catch(RuntimeException ae) {
            JOptionPane.showMessageDialog(null, ERR_MSG, MSG_TITLE, 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        String msg = "Your last name is: " + lastName ;
         String msg2 = "Your first name is: " + firstName ;
        JOptionPane.showMessageDialog(null, msg +" and "+ msg2);
        
        
    }
     
     
}
