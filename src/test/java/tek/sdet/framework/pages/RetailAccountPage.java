package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(id = "personalUpdateBtn")
	public WebElement profileUpdateButton;
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordField;
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordField;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassField;
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdateMessage;
	@FindBy( xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[3]/div[2]/p")
	public WebElement paymentMethod;
	@FindBy( xpath = "//*[@id=\"96q7ype\"]")
	public WebElement succesfulMethodPay;
	//*[@fdprocessedid=\"pj6wf\"]
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement editBtn;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updateYourCard;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
	public WebElement myFirstCard;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement removeAccountOption;
	
	@FindBy(xpath = "(//*[@xmlns=\"http://www.w3.org/2000/svg\"])[4]")
	public WebElement addAddressOption;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[2]")
	public WebElement removeAddressOption;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}