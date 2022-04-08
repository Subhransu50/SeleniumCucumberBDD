package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@CucumberOptions(features="src/test/java/features/Login.feature",glue="stepDefinations")
//@CucumberOptions(features="src/test/java/features/LoginCopy.feature",glue="stepDefinations",tags="@Smoke and @Regression or @Sanity")
@CucumberOptions(features="src/test/java/features/LoginCopy.feature",glue="stepDefinations",plugin= {"pretty","html:target/index1.html","junit:target/cukes.xml"},monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
