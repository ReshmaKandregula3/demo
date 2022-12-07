package toolsQa.Stepdef;

import toolsQa.Stepdef.classPackage.BookShop;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    BookShop obj = new BookShop();

    @Given("user should open url")
    public void userShouldOpenUrl() throws InterruptedException {
        obj.urlPage();
    }

//    @When("user able to login")
//    public void userAbleToLogin(){
//        obj.login();
//    }
//
//    @Given("user choose a product")
//    public void userChooseAProduct() {
////        obj.AddToCart();
////        obj.Cart();
////        obj.CheckOut();
//    }
//
//    @When("user give the details")
//    public void userGiveTheDetails() {
//       // obj.Information();
//    }
//
//    @Then("User should overview order")
//    public void userShouldOverviewOrder() {
//        //obj.Overview();
//    }
//
//    @When("User back to homepage")
//    public void userBackToHomepage() throws InterruptedException {
//        //obj.BackToHome();
//    }
//
//    @Then("User can logout")
//    public void userCanLogout() throws InterruptedException {
//        //obj.Logout();
//    }
//
//    @Given("User able to close the browser")
//    public void userAbleToCloseTheBrowser() throws InterruptedException {
//      //  obj.Quit();
//    }
}
