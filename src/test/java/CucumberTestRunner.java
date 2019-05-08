

import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "ru.savkk.test",
        tags = " @Given,@When",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
//        name = "^Успешное|Успешная.*"
)
public class CucumberTestRunner {
}
