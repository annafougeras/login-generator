package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void setUp() {
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenomNominative() {
        assertEquals("PDUR",
                     loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenomSecondDuplicate() {
        assertEquals("JRAL2",
                loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenomFirstDuplicate() {
        assertEquals("JROL1",
                loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenomAccents() {
        assertEquals("PDUR",
                loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }

}