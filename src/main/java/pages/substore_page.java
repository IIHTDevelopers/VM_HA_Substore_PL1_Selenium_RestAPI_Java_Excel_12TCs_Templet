package pages;

import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static io.restassured.RestAssured.given;
import coreUtilities.utils.FileOperations;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class substore_page extends StartupPage {

	public substore_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//	TC-1 Locators
	public By getUsernameTextfieldLocator = null;
	public By getPasswordTextboxLocator = null;
	public By getSignInButtonLocator = null;
	public By getDropDownLocater = null;
//	TC-2 Locators
	public By getCounterButtonFourth = null;
//	TC-3,5 and 7 common Locator
	public By getAnchorTagLocatorByText = null;
	public By getModuleSignoutLocator = null;
	public By getHoverText = null;
//	TC-4 Locators
	public By getSubModuleLocator = null;
	
//	TC-8 Locators
	public By getButtonLocatorsBytext = null;
	public By getCreateRequisitionButton = null;
	public By searchBarId = null;
	public By getStarIconLocator = null;
	
	public By getRadioButtonLocator(String radioButtonName) {
		return By.xpath("//label[contains(text(),'" + radioButtonName + "')]/span");
	}
	
	
	private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

	// FileOperations instance to read data from Excel
	FileOperations fileOperations = new FileOperations();


	/**
	 * @Test 1.1 : about this method loginToHealthAppByGivenValidCredetial()
	 * @param : Map<String, String>, Fetch and fill the details from expected_data.xlsx file
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return false;

	}

	/**
	 * @Test 1.2 about this method scrollDownAndClickSubstoreTab()
	 * @param : null
	 * @description : Scroll to Substore tab, click it and verify its presence
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean scrollDownAndClickSubstoreTab() throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test1.3 about this method verifySubstorePageUrl()
	 * @param : null
	 * @description : return the URL of the current page. 
	 * @return : String
	 * @author : YAKSHA
	 */

	public String verifySubstorePageUrl() throws Exception {
		// write your logic here
				return null;
	}

	/**
	 * @Test2 about this method countAvailableSubstores()
	 * @param : null
	 * @description : Clicks Counter modules
	 * @return : Boolean
	 * @throws : YAKSHA
	 */
	public boolean countAvailableSubstores() throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test3 - about this method verifyModuleSignoutHoverText()
	 * @param substoreExpectedData : Map<String, String> - Contains expected hover text
	 * @description : This method verifies that the hover text on the "Sign Out" module matches the expected value.
	 * @return : boolean - true if the hover text matches the expected value, false otherwise.
	 * @author : YAKSHA
	 */
	public boolean verifyModuleSignoutHoverText(Map<String, String> substoreExpectedData) throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test4 about this method verifySubstoreSubModule()
	 * @param substoreExpectedData : Map<String, String> - A map containing expected substore data, such as URLs or other related information.
	 * @description : This method verifies that the substore module's sub-modules(Inventory, Pharmacy) are visible.
	 * @return : boolean - true if the sub-modules are visible and clickable, false otherwise.
	 * @throws : Exception - if there is an issue finding or interacting with the sub-modules.
	 * @author : YAKSHA
	 */
	public boolean verifySubstoreSubModule(Map<String, String> substoreExpectedData) throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test5 about this method verifyAllSubstoreModulesAreDisplayedInSublist()
	 * @param moduleName : String - The name of the module to verify.
	 * @description : This method verifies if the specified module's sub-modules are present and visible.
	 * @return : boolean - true if the sub-modules are displayed, false otherwise.
	 * @throws : Exception - if there is an issue finding the sub-modules or if no elements are found.
	 * @author : YAKSHA
	 */
	public boolean verifyAllSubstoreModulesAreDisplayedInSublist(String moduleName) throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test6 about this method verifyNavigationBetweenSubmodules()
	 * @param : null
	 * @description : This method verifies that the user is able to navigate between the sub modules.
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean verifyNavigationBetweenSubmodules() throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test7 about this method takingScreenshotOfTheCurrentPage()
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		// write your logic here
				return false;
	}

	/**
	 * @Test8 about this method
	 * @param : null
	 * @description : This method verifies the visibility of various UI components on the page, including buttons, input fields, dropdowns, and checkboxes.
	 * @return : boolean - Returns true if all specified UI components are
	 *         displayed, otherwise false.
	 * @throws : Exception - if there is an issue finding any of the UI components.
	 * @author : YAKSHA
	 */
	public boolean verifyIfInventoryReqInputFieldsDropdownsAndCheckboxesAreVisibleOrNot() throws Exception {
		// write your logic here
				return false;
	}
	
	
	/**
	 * @Test9 about this method getPostById()
	 * 
	 * @param : int id - The ID of the post to retrieve.
	 * @description : This method sends a GET request to retrieve a specific post by
	 *              its ID.
	 * @return : Response - The response from the API containing the post details.
	 */
	public Response getPostById(int id) {
		return null;
	}
	
	/**
	 * @Test10 about this method updatePost()
	 * 
	 * @param : int id - The ID of the post to update.
	 * @param : String newTitle - The new title to update the post with.
	 * @param : String newBody - The new body content to update the post with.
	 * @param : int userId - The user ID associated with the post.
	 * @description : This method sends a PUT request to update a post with new
	 *              title, body, and user ID.
	 * @return : Response - The response from the API after updating the post.
	 */
	public Response updatePost(int id, String newTitle, String newBody, int userId) {
		return null;
	}
	
	/**
	 * @Test11 about this method deletePost()
	 * 
	 * @param : int id - The ID of the post to delete.
	 * @description : This method sends a DELETE request to remove a specific post
	 *              by its ID.
	 * @return : Response - The response from the API after attempting to delete the
	 *         post.
	 */
	public Response deletePost(int id) {
		return null;
	}
	
	/**
	 * @Test12 about this method getCommentsForPost()
	 * 
	 * @param : int postId - The ID of the post to retrieve comments for.
	 * @description : This method sends a GET request to retrieve comments
	 *              associated with a specific post.
	 * @return : Response - The response from the API containing the list of
	 *         comments.
	 */
	public Response getCommentsForPost(int postId) {
		return null;
	}
	
}
