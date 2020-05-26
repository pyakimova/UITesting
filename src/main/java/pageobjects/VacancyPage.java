package pageobjects;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class VacancyPage  extends AbstractPage
{
    @NameOfElement("QA микросервисов")
    @FindBy(xpath = "//a[text()[contains(.,'QA микросервисов')]]")
    public SelenideElement QAvacancy;

    @NameOfElement("Должностные обязанности")
    @FindBy(xpath =
            "//a[text()[contains(.,'QA микросервисов')]]"
                    + "/parent::li/child::div/child::h3[text()='Должностные обязанности:']"
                    + "/following-sibling::*[1]")
    public SelenideElement QAduties;

}
