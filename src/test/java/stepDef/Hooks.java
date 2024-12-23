package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static Helper.utility.quitDriver;
import static Helper.utility.startDriver;

public class Hooks {


    @Before
    public static void beforeTest() {
        startDriver();
    }

    @After
    public static void afterTest() { //throws InterruptedException {
       // Thread.sleep(3000);
        try {
            quitDriver();
        } catch (Exception e){
            System.out.println("Error while quitting driver: " + e.getMessage());
        }

    }
}
//https://katalon-demo-cura.herokuapp.com/profile.php#login
