package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.VacancyPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyStepdefs
{

    VacancyPage vacancyPage = page(VacancyPage.class);

    @Given("^open site bcs$")
    public void openBCSVacancyRu()
    {
        open("https://bcs.ru/vacancy/novosibirsk");
    }

    @And("^wait link QA микросервисов appears$")
    public void waitUntilVacancyAppears()
    {
        vacancyPage.vacancy.waitUntil(Condition.appears, 7000);
    }

    @When("^click link QA микросервисов$")
    public void clickVacancy()
    {
        vacancyPage.vacancy.click();
    }

    @And("^wait until duties appears$")
    public void waitUntilDutiesAppears()
    {
        vacancyPage.duties.waitUntil(Condition.appears, 7000);
    }

    @Then("^check duties exactly$")
    public void checkDuties()
    {

    }
}

