package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
                              features = "src/test/resources/features/academyChoucair.feature",
                              tags = "@Regresion",
                              glue = " co.com.choucair.certification.proy" +
                                      "ectobase.stepdefinitions",
                              snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}