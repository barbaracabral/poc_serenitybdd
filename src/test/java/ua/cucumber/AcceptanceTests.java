package ua.cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/")
public class AcceptanceTests {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("****BEFORE CLASS. Create your fixtures here.");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("****AFTER CLASS. Delete your fixtures here.");
	}


}
