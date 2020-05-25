package pageobjects;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class VacancyPage  extends AbstractPage
{
    @NameOfElement("QA микросервисов")
    @FindBy(xpath = "\".//*[contains(text(),'QA микросервисов')]\"")
    public SelenideElement vacancy;

    @NameOfElement("Должностные обязанности")
    @FindBy(xpath = "\".//*[contains(text(),'Должностные обязанности')]\"")
    public SelenideElement duties;

}
