package test;

import org.testng.annotations.Test;
import page.SignUp;
import util.TestBase;


public class SignUpTest extends TestBase {

    SignUp page = new SignUp();

    @Test()
   public void SignUp() throws InterruptedException {
        page.goToHomePage();
        page.createAccount();
    }

}
