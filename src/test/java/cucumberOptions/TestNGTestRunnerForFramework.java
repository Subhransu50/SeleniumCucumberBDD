package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchProduct.feature",glue="stepDefinations",plugin= {"pretty","html:target/index2.html","junit:target/cukes.xml"},monochrome=true)
public class TestNGTestRunnerForFramework extends AbstractTestNGCucumberTests{

}
