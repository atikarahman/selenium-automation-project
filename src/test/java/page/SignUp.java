package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.TestUtil;

import static util.TestBase.driver;

public class SignUp {

    TestUtil ut = new TestUtil();

    String baseURL = "https://www.tesla.com";

 By accountLocator = By.xpath("//*[@id=\"tds-site-header\"]/ol[2]/li[2]/a/span");
 By createAccountLocator = By.xpath("//*[@id=\"form-button-create\"]");
 By firstNameLocator = By.id("form-input-first_name");
 By lastNameLocator = By.id("form-input-last_name");
 By emailLocator = By.id("form-input-email");
 By passwordLocator = By.id("form-input-password");
 By agreeTermLocator = By.id("agree-with-privacy-and-terms");
 By captchaLocator = By.id("captcha");
 By submitLocator = By.id("form-submit-continue");


  public void goToHomePage(){ ut.navigateTo(baseURL);}

  public void createAccount() throws InterruptedException {
      WebElement clickAccount = driver.findElement(accountLocator);
      clickAccount.click();

      WebElement clickCreateAccount = driver.findElement(createAccountLocator);
      clickCreateAccount.click();

      WebElement clickFirstName = driver.findElement(firstNameLocator);
      clickFirstName.click();
      ut.enterText(firstNameLocator,"Atika");

      WebElement clickLastName = driver.findElement(lastNameLocator);
      clickLastName.click();
      ut.enterText(lastNameLocator,"Rahman");

      WebElement clickEmail = driver.findElement(emailLocator);
      clickEmail.click();
      ut.enterText(emailLocator,"atika.rahman000@gmail.com");

      WebElement clickPassword = driver.findElement(passwordLocator);
      clickPassword.click();
      ut.enterText(passwordLocator,"Atika@2256");

      WebElement clickAgreeTerm = driver.findElement(agreeTermLocator);
      clickAgreeTerm.click();

      WebElement clickCaptcha = driver.findElement(captchaLocator);
      clickCaptcha.click();

      Thread.sleep(5000);

      WebElement clickSubmit = driver.findElement(submitLocator);
      clickSubmit.click();


  }
}
