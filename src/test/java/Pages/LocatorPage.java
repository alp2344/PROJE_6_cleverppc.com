package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent {

    public LocatorPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = ".login")
    private WebElement singInClick;
    @FindBy(id = "email_create")
    private WebElement emailBoxSendKeys;
    @FindBy(css = "[class='icon-user left']")
    private WebElement createAccountButtonClick;
    @FindBy(id = "id_gender1")
    private WebElement genderMale;
    @FindBy(id = "customer_firstname")
    private WebElement firstName;
    @FindBy(id = "customer_lastname")
    private WebElement lastName;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "days")
    private WebElement days;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(id = "years")
    private WebElement years;
    @FindBy(id = "submitAccount")
    private WebElement submitAccount;
    @FindBy(xpath = "//p[contains(text(),'Your account has been created.')]")
    private WebElement accountSuccess;
    @FindBy(css = ".account span")
    private WebElement myAccount;
    @FindBy(xpath = "//p[contains(text(),'Welcome to your account.')]")
    private WebElement myAccountSuccess;
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    private WebElement errorAccountSuccess;
    @FindBy(id = "SubmitLogin")
    private WebElement SubmitLogin;
    @FindBy(css = "[title='Sitemap']")
    private WebElement siteMap;
    @FindBy(xpath = "(//a[@title='My addresses'])[1]")
    private WebElement myAddress;
    @FindBy(css = "[title='Add an address']")
    private WebElement newAddress;
    @FindBy(id = "address1")
    private WebElement address1;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(xpath = "//option [text()='Ohio']")
    private WebElement idState;
    @FindBy(id = "postcode")
    private WebElement postCode;
    @FindBy(id = "phone")
    private WebElement phone;
    @FindBy(id = "phone_mobile")
    private WebElement phoneMobile;
    @FindBy(id = "submitAddress")
    private WebElement submitAddress;
    @FindBy(xpath = "//strong[text()='Your addresses are listed below.']")
    private WebElement addressSuccess;
    @FindBy(xpath = "//a[text()='Women']")
    private WebElement womanHover;
    @FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
    private WebElement summerDresses;
    @FindBy(xpath = "(//a[@class='product_img_link'])[1]")
    private WebElement productHover1;
    @FindBy(xpath = "(//a[@class='product_img_link'])[2]")
    private WebElement productHover2;
    @FindBy(xpath = "(//a[@class='product_img_link'])[3]")
    private WebElement productHover3;
    @FindBy(xpath = "(//span[@class='price product-price'])[5]")
    private WebElement priceText;
    @FindBy(xpath = "(//span[text()='Add to cart'])[1]")
    private WebElement addToCard1;
    @FindBy(xpath = "(//span[text()='Add to cart'])[2]")
    private WebElement addToCard2;
    @FindBy(xpath = "(//span[text()='Add to cart'])[3]")
    private WebElement addToCard3;
    @FindBy(css = "[title='Proceed to checkout']")
    private WebElement proceedToCheckout;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElement continueShopping;
    @FindBy(css = "[class='cart_description']")
    private WebElement addToName;
    @FindBy(id = "total_price_without_tax")
    private WebElement totalPrice;
    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    private WebElement dresses;
    @FindBy(xpath = "//span[text()='There are 5 products.']")
    private WebElement headingCounter;
    @FindBy(xpath = "(//div[@class='product-count'])[2]")
    private WebElement headingCount;
    @FindBy(xpath = "//span[text()='Add to cart']")
    private List<WebElement> dressList;
    @FindBy(css = "a[title='View my shopping cart']")
    private WebElement shoppingCard;
    @FindBy(id = "button_order_cart")
    private WebElement buttonOrderCard;
    @FindBy(css = "#cart_summary tbody tr")
    private List<WebElement> cardItemList;
    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    private WebElement checkoutButton1;
    @FindBy(css = "label[for='cgv']")
    private WebElement checkBox;
    @FindBy(css = "[name='processCarrier']")
    private WebElement checkoutButton2;
    @FindBy(id = "paypal-standard-btn")
    private WebElement paypalButton;
    @FindBy(css = "[class='message']")
    private WebElement paypalMessage;
    @FindBy(css = "[href='javascript:void(0);']")
    private WebElement creditCardButton;
    @FindBy(xpath = "//*[text()='Invalid request (1).']")
    private WebElement creditCardMessage;
    @FindBy(css = "[class='bankwire']")
    private WebElement bankWire;
    @FindBy(css = "[class='button btn btn-default button-medium']")
    private WebElement confirmButton;
    @FindBy(css = "[class='alert alert-success']")
    private WebElement alertCompleteMessage;
    @FindBy(xpath = "(//a[@title='Contact us'])[1]")
    private WebElement contactUs;
    @FindBy(xpath = "//option[text()='Customer service']")
    private WebElement customerService;
    @FindBy(id = "id_order")
    private WebElement orderBox;
    @FindBy(id = "uniform-fileUpload")
    private WebElement fileUpload;
    @FindBy(id = "submitMessage")
    private WebElement submitButton;
    @FindBy(id = "message")
    private WebElement message;
    @FindBy(xpath = "//select[@name='id_order']/option[2]")
    private WebElement orderReference;

    @FindBy(xpath = "//select[@id=\"239_order_products\"]/option[2]")
    private WebElement product;

    public List<WebElement> getDressList() {
        return dressList;
    }

    public List<WebElement> getCardItemList() {
        return cardItemList;
    }

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "singInClick":
                return this.singInClick;
            case "emailBoxSendKeys":
                return this.emailBoxSendKeys;
            case "createAccountButtonClick":
                return this.createAccountButtonClick;
            case "genderMale":
                return this.genderMale;
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "email":
                return this.email;
            case "password":
                return this.password;
            case "days":
                return this.days;
            case "months":
                return this.months;
            case "years":
                return this.years;
            case "submitAccount":
                return this.submitAccount;
            case "accountSuccess":
                return this.accountSuccess;
            case "myAccount":
                return this.myAccount;
            case "myAccountSuccess":
                return this.myAccountSuccess;
            case "SubmitLogin":
                return this.SubmitLogin;
            case "errorAccountSuccess":
                return this.errorAccountSuccess;
            case "siteMap":
                return this.siteMap;
            case "myAddresses":
                return this.myAddress;
            case "newAddress":
                return this.newAddress;
            case "address1":
                return this.address1;
            case "city":
                return this.city;
            case "idState":
                return this.idState;
            case "postCode":
                return this.postCode;
            case "phone":
                return this.phone;
            case "phoneMobile":
                return this.phoneMobile;
            case "submitAddress":
                return this.submitAddress;
            case "addressSuccess":
                return this.addressSuccess;
            case "womanHover":
                return this.womanHover;
            case "summerDresses":
                return this.summerDresses;
            case "productHover1":
                return this.productHover1;
            case "productHover2":
                return this.productHover2;
            case "productHover3":
                return this.productHover3;
            case "priceText":
                return this.priceText;
            case "addToCard1":
                return this.addToCard1;
            case "addToCard2":
                return this.addToCard2;
            case "addToCard3":
                return this.addToCard3;
            case "proceedToCheckout":
                return this.proceedToCheckout;
            case "continueShopping":
                return this.continueShopping;
            case "addToName":
                return this.addToName;
            case "totalPrice":
                return this.totalPrice;
            case "dresses":
                return this.dresses;
            case "headingCounter":
                return this.headingCounter;
            case "headingCount":
                return this.headingCount;
            case "shoppingCard":
                return this.shoppingCard;
            case "buttonOrderCard":
                return this.buttonOrderCard;
            case "checkoutButton1":
                return this.checkoutButton1;
            case "checkBox":
                return this.checkBox;
            case "checkoutButton2":
                return this.checkoutButton2;
            case "paypalButton":
                return this.paypalButton;
            case "paypalMessage":
                return this.paypalMessage;
            case "creditCardButton":
                return this.creditCardButton;
            case "creditCardMessage":
                return this.creditCardMessage;
            case "bankWire":
                return this.bankWire;
            case "confirmButton":
                return this.confirmButton;
            case "alertCompleteMessage":
                return this.alertCompleteMessage;
            case "contactUs":
                return this.contactUs;
            case "customerService":
                return this.customerService;
            case "orderBox":
                return this.orderBox;
            case "fileUpload":
                return this.fileUpload;
            case "submitButton":
                return this.submitButton;
            case "message":
                return this.message;
            case "orderReference":
                return this.orderReference;
            case "product":
                return this.product;
        }
        return null;
    }
}