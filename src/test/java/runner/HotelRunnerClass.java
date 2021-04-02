package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//HotelBookingPage.feature",glue="hotelstepdep",monochrome=true)
public class HotelRunnerClass {

}
