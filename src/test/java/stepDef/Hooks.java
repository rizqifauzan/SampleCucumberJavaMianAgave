package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static Helper.utility.quitDriver;
import static Helper.utility.startDriver;

public class Hooks {
//    @BeforeAll
//    public static void setUp() {
//    }
//
//    @AfterAll
//    public static void tearDown() {
//    }

    @Before
    public static void beforeTest() {
        startDriver();
    }

    @After
    public static void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        quitDriver();

    }
}
//https://katalon-demo-cura.herokuapp.com/profile.php#login
