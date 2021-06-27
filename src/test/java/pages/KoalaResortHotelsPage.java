package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaResortHotelsPage {
    public KoalaResortHotelsPage(){
        PageFactory.initElements(Driver.getDriver(),this
        );
    }
}
