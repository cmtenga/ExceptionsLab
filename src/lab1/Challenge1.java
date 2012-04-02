package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques. <p> Your challenge is to consider all the
 * possible things that can go wrong with this program and use exception
 * handling where appropriate to prevent the program from crashing. In addition
 * you must display a friendly error message in a JOptionPane and ask the user
 * to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;
    private static final String ERR_MSG =
            "Only, first name and  last name are required, no more.  "
            + "Please try again.";
    private static final String MSG_TITLE = "Input Error";

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);

    }

    public String extractLastName(String fullName) {
        //String[] nameParts = fullName.split(" ");
        String lastName = "Unknown";

        try {
            String[] nameParts = fullName.split(" ");
            lastName = nameParts[LAST_NAME_IDX];

            if (nameParts.length != 2) {
                throw new IllegalArgumentException();
            }

        } catch (NullPointerException e) {
            e.getMessage();
            System.exit(0);
        } catch (RuntimeException er) {
            JOptionPane.showMessageDialog(null, ERR_MSG, MSG_TITLE,
                    JOptionPane.ERROR_MESSAGE);
            er.getMessage();

        }
        return lastName;
    }
}
