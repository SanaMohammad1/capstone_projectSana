package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().paymentMethod);
		logger.info("user clicked on Update button");
		
	}
	@Then("payment message displayed {string}")
	public void paymentMessageDislpayed(String string) {
		//waitTillPresence(factory.accountPage().succesfulMethodPay);
//		Assert.assertEquals(string,factory.accountPage().succesfulMethodPay.getText());
		getDriver().getPageSource().contains("Payment Method added successfully");
		logger.info("a review message should be displayed "+string);
	}
	@Then("User fill new Debit or credit card information")
	public void userFillNewDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> addCard = dataTable.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput,addCard.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput,addCard.get(0).get("nameOnCard"));
		sendText(factory.homePage().expirationMonthInput, addCard.get(0).get("expirationMonth"));
		sendText(factory.homePage().expirationYearInput,addCard.get(0).get("expirationYear"));
		sendText(factory.homePage().securityCodeInput,addCard.get(0).get("securityCode"));
		logger.info("user filled the add Debit or Credit ");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().myFirstCard);
		click(factory.accountPage().editBtn);

	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> addCard = dataTable.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput,addCard.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput,addCard.get(0).get("nameOnCard"));
		sendText(factory.homePage().expirationMonthInput, addCard.get(0).get("expirationMonth"));
		sendText(factory.homePage().expirationYearInput,addCard.get(0).get("expirationYear"));
		sendText(factory.homePage().securityCodeInput,addCard.get(0).get("securityCode"));
		logger.info("user edited the add Debit or Credit ");

	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCard);
	}
	@Then("update message should be displayed {string}")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully(String string) {

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().myFirstCard);
		click(factory.accountPage().removeAccountOption);
			logger.info("user clicked on remove option");	
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	}
	
	
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);

	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		
	    
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	   
	}
	@Then("address message should be displayed {string}")
	public void addressMessageShouldBeDisplayedOrderPlacedThanks(String string) {
		getDriver().getPageSource().contains("Address Added Succesfully");
		logger.info("address changed");
	}


@When("User click on remove option of Address section")
public void userClickOnRemoveOptionOfAddressSection() {

	click(factory.accountPage().removeAddressOption);
	
}
@Then("Address details should be removed")
public void addressDetailsShouldBeRemoved() {
}
}

