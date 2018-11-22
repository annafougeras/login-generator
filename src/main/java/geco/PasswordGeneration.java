package geco;

import java.util.Random;
import java.util.stream.Collectors;

public class PasswordGeneration {

    /**
     * The length of the password.
     */
    private static final int PASSWORD_LENGTH = 8;

    /**
     * The characters allowed in the password.
     */
    private static final String CHARACTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789";

    /**
     * Generate a random 8 character password.
     *
     * @return the generated password
     */
    public String getRandomPassword() {
        String pass = new Random()
                .ints(PASSWORD_LENGTH,0, CHARACTERS.length())
                .mapToObj(i -> "" + CHARACTERS.charAt(i))
                .collect(Collectors.joining());
        return pass;
    }
}
