package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService loginService;

    @Before
    public void setUp() {
        String[] logins = { "aaa", "bbb", "ccc", "ccd" };
        loginService = new LoginService(logins);
    }

    @Test
    public void testLoginExists() {
        assertTrue(loginService.loginExists("aaa"));
    }

    @Test
    public void testAddLogin() {
        loginService.addLogin("ddd");
        assertTrue(loginService.loginExists("ddd"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        assertEquals(Arrays.asList("ccc", "ccd"), loginService.findAllLoginsStartingWith("cc"));
    }

    @Test
    public void testFindAllLogins() {
        assertEquals(Arrays.asList("aaa", "bbb", "ccc", "ccd"),
                     loginService.findAllLogins());
    }
}