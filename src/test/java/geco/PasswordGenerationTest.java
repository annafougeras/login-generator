package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private PasswordGeneration passwordGeneration;

    @Before
    public void setUp() {
        passwordGeneration = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        assertEquals(8, passwordGeneration.getRandomPassword().length());
    }
}
