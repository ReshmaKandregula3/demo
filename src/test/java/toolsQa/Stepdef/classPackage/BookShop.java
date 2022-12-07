package toolsQa.Stepdef.classPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BookShop {
    WebDriver driver;

        public void urlPage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RKANDREG\\chromedriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            driver.findElement(By.id("user-name")).click();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
            driver.findElement(By.id("checkout")).click();
            driver.findElement(By.id("first-name")).sendKeys("Tinku");
            driver.findElement(By.id("last-name")).sendKeys("Crazeee");
            driver.findElement(By.id("postal-code")).sendKeys("600751");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            driver.findElement(By.id("back-to-products")).click();
            driver.findElement(By.id("react-burger-menu-btn")).click();
           driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            driver.findElement(By.id("logout_sidebar_link")).click();
            driver.close();

        }
        //
//    public void login()  {
//       driver.findElement(By.id("user-name")).sendKeys("standard_user");
//    }
//
//    public void AddToCart() {
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//    }
//
//    public void Cart(){
//        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//    }
//
//    public void CheckOut() {
//        driver.findElement(By.id("checkout")).click();
//    }
//
//    public void Information() {
//        driver.findElement(By.id("first-name")).sendKeys("Sandeep");
//        driver.findElement(By.id("last-name")).sendKeys("Mondal");
//        driver.findElement(By.id("postal-code")).sendKeys("700124");
//        driver.findElement(By.id("continue")).click();
//    }
//
//    public void Overview() {
//        driver.findElement(By.id("finish")).click();
//    }
//
//    public void BackToHome() throws InterruptedException {
//        driver.findElement(By.id("back-to-products")).click();
//
//    }
//
//    public void Logout() throws InterruptedException {
//        driver.findElement(By.id("react-burger-menu-btn")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("logout_sidebar_link")).click();
//    }
//
//    public void Quit() throws InterruptedException {
//        driver.quit();
//    }
//
//
//}
//        public void login() {
//
//        }
//
//        public void AddToCart() {
//            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        }
//
//        public void Cart(){
//
//            driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//        }
//
//        public void CheckOut() {
//
//            driver.findElement(By.id("checkout")).click();
//        }
//
//        public void Information() {
//            driver.findElement(By.id("first-name")).sendKeys("Sandeep");
//            driver.findElement(By.id("last-name")).sendKeys("Mondal");
//            driver.findElement(By.id("postal-code")).sendKeys("700124");
//            driver.findElement(By.id("continue")).click();
//        }
//
//        public void Overview() {
//            driver.findElement(By.id("finish")).click();
//        }
//
//        public void BackToHome() throws InterruptedException {
//            driver.findElement(By.id("back-to-products")).click();
//
//        }
//
//        public void Logout() throws InterruptedException {
//            driver.findElement(By.id("react-burger-menu-btn")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.id("logout_sidebar_link")).click();
//        }
//
//        public void Quit() throws InterruptedException {
//            driver.quit();
//        }
//
//
    }

