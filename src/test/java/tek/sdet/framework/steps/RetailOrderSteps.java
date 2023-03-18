package tek.sdet.framework.steps;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
//import tek.capstone.framework.pages.POMFactory;
//import tek.capstone.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory=new POMFactory();
	
	@When("User click on login button")
	public void userClickOnLoginButton() {
	     click(factory.signInPage().loginPageButton);
	     logger.info("User click on login button");
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	     click(factory.orderPage().ordersBtn);
	     logger.info("User click on Orders section");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() throws InterruptedException {
		waitTillClickable(factory.homePage().KasaOutDoorSmartPlug);
	     click(factory.homePage().KasaOutDoorSmartPlug);
	     Thread.sleep(3000);
	     logger.info("User click on first order in list");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.orderPage().cancelTheOrder);
	    logger.info("User click on Cancel The Order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String string) {
		selectByVisibleText(factory.orderPage().cancellationReason,string);
		logger.info("User select the cancelation Reason ‘Bought wrong item’");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	     click(factory.orderPage().OrderCancellationBtn);
	     logger.info("User click on Cancel Order button");
	}
//	@Then("a cancelation message should be displayed {string}")
//	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String string) {
//		waitTillPresence(factory.orderPage().cancelConfirmationMessage);
//		Assert.assertEquals(string,factory.orderPage().cancelConfirmationMessage.getText());
//		logger.info("a cancelation message should be displayed " +string);
//	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnItems);
	    logger.info("User click on Return Items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String itemDamaged ) {
		 selectByVisibleText(factory.orderPage().returnReason,itemDamaged);
	    logger.info("User select the Return Reason ‘Item damaged’");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String string) {
	   selectByVisibleText(factory.orderPage().dropOffLocation,string);
	   logger.info("User select the drop off service ‘FedEx’");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	     click(factory.orderPage().returnOrderSubmitBtn);
	     logger.info("User click on Return Order button");
	}
	@Then("a return message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessfull(String string) {
		waitTillPresence(factory.orderPage().returnSuccessfulMessage);
		Assert.assertEquals(string,factory.orderPage().returnSuccessfulMessage.getText());
		logger.info("a review message should be displayed "+string);
	}
//	@Then("a Cancelation message should be displayed {string}")
//	public void acancelationMessageShouldBeDisplayedReturnWasSuccessful(String string) {
//	     Assert.assertEquals(string,factory.orderPage().returnSuccessfulMessage.getText());
//	     logger.info("a cancelation message should be displayed "+string);
//	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User click on Review button");
	}
	@When("User click on apex result")
	public void userClickOnApexResult() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.homePage().apexResult);
		logger.info("User click on apex");
	}
	@When("User click on kasa result")
	public void userClickOnKasaResult() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.homePage().kasaResult);
		logger.info("User click on kasa");
	}
	@When("User click on Apex Legend item")
	public void userClickOnApexLegendItem() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.homePage().apexItemClick);
		logger.info("User click on item");
	}
	@When("User search for an apex item {string}")
	public void userSearchForAnApexItem(String apexLegend) {
		sendText(factory.homePage().searchBar, apexLegend);
		logger.info(apexLegend + " User search for this element");
	}
	@When("User write Review headline  {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		sendText(factory.orderPage().reviewHeadLineBtn, string);
		sendText(factory.orderPage().reviewBodyMessage, string2);
		logger.info("User write Review headline "+string+" review Body Message"+string2);
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitButton);
		logger.info("User click Add your Review button");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String string) {
		waitTillPresence(factory.orderPage().reviewSuccessMessage);
		Assert.assertEquals(string,factory.orderPage().reviewSuccessMessage.getText());
		logger.info("a review message should be displayed "+string);
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String string) {
//		waitTillPresence(factory.orderPage().reviewSuccessMessage);
		Assert.assertEquals(string,factory.orderPage().cancelConfirmationMessage.getText());
		logger.info("a review message should be displayed "+string);
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryToElectronics(String string) {
//		click(factory.homePage().allDepartmentDropDown);
//		click(factory.homePage().electronics);
		selectByVisibleText(factory.homePage().allDepartmentDropDown, "Electronics");
	}
@When("User change category to {string}")
public void userChangeCategoryToSmartHome(String string) {
//	click(factory.homePage().allDepartmentDropDown);
//	click(factory.homePage().electronics);
	selectByVisibleText(factory.homePage().allDepartmentDropDown, "Smart Home");
}
	@When("User select quantity {int}")
	public void userSelectQuantity(Integer int1) {
		selectByIndex(factory.homePage().quantityApexItem, int1);
		click(factory.homePage().addCardBtn);
	}
	@Then("the cart icon quantity should change to {int}")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
	Assert.assertEquals(int1,factory.homePage().cartQuantity5Items.getText());		
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String string) {
		Assert.assertEquals(string, factory.homePage().orderPlacedSuccessfullyMassege.getText());
		logger.info("the cart icon quantity should change to " + string);
	}
	//new 
//	@When("User click on kasa result")
//	public void userClickOnKasaResult() {
//	}
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.homePage().countryDropDownButton,addInfo.get(0).get("country"));
		sendText(factory.homePage().fullName,addInfo.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumberInput, addInfo.get(0).get("phoneNumber"));
		sendText(factory.homePage().streetInput,addInfo.get(0).get("streetAddress"));
		sendText(factory.homePage().apartmentInput,addInfo.get(0).get("apt"));
		sendText(factory.homePage().cityInput,addInfo.get(0).get("city"));
		//sendText(factory.homePage().stateSelect, addInfo.get(0).get("state"));
		selectByIndex(factory.homePage().stateSelect, 1);
		sendText(factory.homePage().zipCodeInput,addInfo.get(0).get("zipCode"));
		logger.info("user filled the new address information form");
	}
	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.homePage().addressBtn);
	}
	@Then("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> addCard = dataTable.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput,addCard.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput,addCard.get(0).get("nameOnCard"));
		sendText(factory.homePage().expirationMonthInput, addCard.get(0).get("expirationMonth"));
		sendText(factory.homePage().expirationYearInput,addCard.get(0).get("expirationYear"));
		sendText(factory.homePage().securityCodeInput,addCard.get(0).get("securityCode"));
		logger.info("user filled the add Debit or Credit ");
	}
	@Then("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.homePage().paymentSubmitBtn);
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {

	}
 }