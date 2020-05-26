package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.VacancyPage;

import static com.codeborne.selenide.Selenide.*;


public class MyStepdefs
{
    WebDriver driver = WebDriverRunner.getWebDriver();
    VacancyPage vacancyPage = page(VacancyPage.class);

    @Given("^open site \"([^\"]*)\"$")
    public void openBCSVacancyRu(String url)
    {
        open("http://www.google.com");
        driver.navigate().to(url);
    }

    @And("^wait link QA микросервисов$")
    public void waitUntilVacancyVisible()
    {
       vacancyPage.QAvacancy.waitUntil(Condition.appears, 1000);
    }

    @When("^click link QA микросервисов$")
    public void clickVacancy()
    {

        vacancyPage.QAvacancy.click();
    }

    @And("^wait duties appears$")
    public void waitUntilDutiesAppears()
    {
        vacancyPage.QAduties.waitUntil(Condition.appears, 5);
    }

    @Then("^check duties amount \"([^\"]*)\"$")
    public void checkDutiesAmount(String expectedAmount)
    {
        String amount = vacancyPage.QAduties.attr("childElementCount");
        assert amount.equals(expectedAmount);
    }
}

