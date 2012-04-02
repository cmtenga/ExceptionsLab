package lab2;

import javax.swing.JOptionPane;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Cecilia Mtenga, cmtenga@my.wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;

    /**
     *
     * @param fullName
     * @return
     */
    public String extractLastName(String fullName) {


        String lastName = "Unknown";

        try {
            String[] nameParts = fullName.split(" ");
            lastName = nameParts[LAST_NAME_IDX];

            if (nameParts.length != 2) {
                throw new IllegalArgumentException();
            }
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return lastName;
    }

    /**
     *
     * @param fullName
     * @return
     */
    public String extractFirstName(String fullName) {
        String[] nameParts = fullName.split(" ");
        String firstName = "Unknown";

        try {
            //String[] nameParts = fullName.split(" ");
            firstName = nameParts[FIRST_NAME_IDX];


            if (nameParts.length != 1) {
                throw new IllegalArgumentException();
            }
        } catch (NullPointerException e) {
            e.getMessage();

        } catch (RuntimeException er) {
            er.getMessage();
        }
        return firstName;
    }

    public NameService() {
    }

    /**
     *
     * @param name
     * @return
     */
    public int getNameLength(String name) {
        return name.length();
    }
}
