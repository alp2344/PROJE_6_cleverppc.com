package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import static Pages.Parent.waiting;

public class AllStepDefinitions extends GWD {

    LocatorPage rp = new LocatorPage();

    @Given("Navigate To Presta Shop 4")
    public void navigateToPrestaShop() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click On The Element")
    public void clickOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            rp.myClick(linkWebElement);
        }
    }

    @And("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.mySendKeys(element, word);
        }
    }

    @And("Enter Data in Select Menu")
    public void enterDataInSelectMenu(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.selectContainElement(element, word);
        }
    }

    @And("Verification Is In Progress")
    public void verificationIsInProgress(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.verifyContainsText(element, word);

        }
    }

    @Given("Hover On The Element")
    public void hoverOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            rp.hoverFunction(linkWebElement);
        }
    }

    @And("Verifying that it is equal to 5")
    public void verifyingThatItIsEqualTo(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = rp.getWebElement(strlinkList.get(i));
            if (linkWebElement.getText().contains("5")) {
                System.out.println("Equal to 5");
            } else {
                System.out.println("Not equal to 5");
            }
        }
    }

    @And("Is the length of the list equal to 5")
    public void isTheLengthOfTheListEqualTo() {
        if (rp.getDressList().size() == 5) {
            System.out.println("Lengths equal 5");
        } else {
            System.out.println("Lengths not equal to 5");
        }
    }

    @And("Is the length of the list equal to 3")
    public void isTheLengthOfTheListEqualTo3() {
        if (rp.getCardItemList().size() == 3) {
            System.out.println("Lengths equal 3");
        } else {
            System.out.println("Lengths not equal to 3");
        }
    }

    @And("Verification is performed and the previous page is returned.")
    public void verificationIsPerformedAndThePreviousPageIsReturned(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = rp.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            rp.verifyContainsText(element, word);
        }
        getDriver().navigate().back();
    }

    @And("Adding Receipt Of Payment File")
    public void addingReceiptOfPaymentFile() throws AWTException {
        Robot robot = new Robot();
        StringSelection path = new StringSelection("/Users/ebuzer/Desktop/asd");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
        waiting(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        waiting(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        waiting(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        //TODO For Mac Users
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String handle : windowHandles) {
//            driver.switchTo().window(handle);
//            if (driver.getTitle().contains("prestashop")) {
//                break;
//            }
//        }
//
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_G);
//        robot.delay(1000);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_G);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(1000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(1000);
    }
}