package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
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
        //String firstName = "Unknown";
        try{
            
         lastName = nameService.extractLastName(fullName);
        //firstName = nameService.extractFirstName(fullName);
      
        } catch(NameServiceException ae) {
            JOptionPane.showMessageDialog(null, ae.getMessage(),  "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        String msg = "Your last name is: " + lastName ;
       // String msg2 = "Your first name is: " + firstName ;
        JOptionPane.showMessageDialog(null, msg );
        //JOptionPane.showMessageDialog(null, msg +" and "+ msg2);
        
    }
     
     
}