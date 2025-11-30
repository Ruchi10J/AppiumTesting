package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {

   static AppiumDriver driver;

    public static  void main(String[] args) throws MalformedURLException, InterruptedException {
       OpenMobileApp();

    }


    public static void OpenMobileApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap= new DesiredCapabilities();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Galaxy Tab S2");
        caps.setCapability("appium:udid", "1df79bf5");
        caps.setCapability("appium:platformVersion", "7.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "com.slt.selfcare");
        caps.setCapability("appium:appActivity", "com.slt.selfcare.SplashActivity");


        AppiumDriver driver = new AppiumDriver(
                new URL("http://127.0.0.1:4723/"), caps
        );


        Thread.sleep(5000);
        System.out.println("Application started");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_userName\")")).sendKeys("ruchi.jayasena@gmail.com");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_password\")")).sendKeys("slt@12345");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_login\")")).click();
        System.out.println("Login successfully!");


        Thread.sleep(10000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tc_accounts\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Account\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_telephoneNo\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_sltAccountNo\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_nicNo\")")).click();
        Thread.sleep(3000);
        System.out.println("Telephone Post Paid account add page tested successfully!");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_pre\")")).click();
        Thread.sleep(4000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_telephoneNo\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_nicNo\")")).click();
        Thread.sleep(3000);
        System.out.println("Telephone Pre Paid account add page tested successfully!");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_vas\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_userNameVas\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_pwdVas\")")).click();
        Thread.sleep(3000);
        System.out.println("Broadband account add page tested successfully!");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);

        System.out.println("Start testing Internet page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_pkg_upgrade\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Unlimited\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Any Time\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested data package upgrade page successfully!");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_Usage\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Extra GB\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Extra GB page successfully!");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Bonus data\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Bonus data page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Free Data\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Free Data page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add-ons Data\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Add-ons Data page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_DailyUsage\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_report\").instance(0)")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click();
        Thread.sleep(3000);
       // driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_report\").instance(0)")).click();
        //Thread.sleep(3000);
       // driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertOk\")")).click();
      //  Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested protocol report successfully!");


        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/page_2\")")).click();
        Thread.sleep(3000);
        System.out.println("Gift Data page tested successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/page_3\")")).click();
        Thread.sleep(8000);
        System.out.println("History page tested successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/page_4\")")).click();
        Thread.sleep(3000);
        System.out.println("Happy Day page tested successfully!"); driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/page_5\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Redeem Data\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Redeem Data page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_nameProtocol\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click();
        Thread.sleep(3000);
        System.out.println("Enable Detailed Report page tested successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_updateContact\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backMyProfile\")")).click();
        Thread.sleep(3000);
        System.out.println("Change Contact Information page tested successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested data usage page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"sltgo\").instance(0)")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click();
        Thread.sleep(3000); System.out.println("Tested sltgo page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Data Add-on\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Data Add-on page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Extra GB\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(10)")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"5GB\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"20GB\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Extra GB page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/lo_billDetailsCardBody\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill History\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill Methods\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill Summary\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        System.out.println("Tested Bill page successfully!");

        Thread.sleep(3000);
        System.out.println("Start testing PEO TV page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"PEO TV\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/lo_peoDetailsBodyContent\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backServiceRequest\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested PEO TV Service Upgrade Request page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"VOD\")")).click(); Thread.sleep(3000); driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\") ")).click();
        Thread.sleep(3000);
        System.out.println("Tested VOD page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"TV Guide\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested TV Guide page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"PEOTV GO\").instance(0)")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested PEO TV GO page successfully!");
        System.out.println("Finished PEO TV page testing successfully!");
        System.out.println("Start testing Voice page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Voice\")")).click();
        Thread.sleep(2000);
        System.out.println("Finished Voice page testing successfully!");
        System.out.println("Start testing Mobile page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mobile\")")).click();
        Thread.sleep(3000); driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click(); Thread.sleep(3000); System.out.println("Finished Mobile page testing successfully!"); System.out.println("Start testing Promo page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Promo\")")).click();
        Thread.sleep(3000); System.out.println("Finished Promo page testing successfully!");
        System.out.println("Start testing Digital Life page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Digital Life\")")).click();
        Thread.sleep(3000);

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddAccount\")")).click();
        Thread.sleep(3000);
        System.out.println("Finished Digital Life page testing successfully!");
        System.out.println("Start testing Hot Devices page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Hot Devices\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backTerms\")")).click();
        Thread.sleep(3000);
        System.out.println("Finished Hot Devices page testing successfully!");
        System.out.println("Start testing New Connection Request page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"New\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/radioButton2\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/radioButton3\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/radioButton1\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backServiceRequest\")")).click();
        Thread.sleep(3000);
        System.out.println("Finished New Connection Request page testing successfully!");
        System.out.println("Start testing Bill page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill History\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill Methods\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Finished Bill page testing successfully!");
        System.out.println("Start testing Complaints page...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Complaints\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddFault\")")).click();
        Thread.sleep(3000);
        System.out.println("Finished Complaints page testing successfully!");
        System.out.println("Start testing Notification Panel...");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Home\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Home page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"My Profile\")")).click(); Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backMyProfile\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested My profile page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Manage Connections\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backManageConnections\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Manage Connections page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.slt.selfcare:id/design_menu_item_text\" and @text=\"Bill\"]")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill History\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill Methods\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bill Summary\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backExtraGB\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Bill page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"My Orders\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertOk\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backServiceRequest\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested My Orders page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Payments\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backPayBill\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Payments page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.slt.selfcare:id/design_menu_item_text\" and @text=\"Complaints\"]")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backAddFault\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Complaints page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Contact Us\")")).click(); Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backMyProfile\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Contact Us page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"FAQ\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_voice\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_ftthInternet\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backFAQ\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested FAQ page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Terms of Use\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backTerms\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Terms of Use page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign out\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertCancel\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/rl_notification\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign out\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_alertOk\")")).click();
        Thread.sleep(3000);
        System.out.println("Sign out from the account successfully!");
        System.out.println("Finished Notification Panel testing successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_forgotPwd\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backForgot\")")).click();
        Thread.sleep(3000);
        System.out.println("Tested Forget Password section successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/tv_signUp\")")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/iv_backSignup\")")).click();
        Thread.sleep(5000);
        System.out.println("Tested Sign Up page successfully!");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_userName\")")).sendKeys("");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/et_password\")")).sendKeys("");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.slt.selfcare:id/btn_login\")")).click();
        System.out.println("MySLT App testing finished successfully!");
        System.exit(0);





    }
}
