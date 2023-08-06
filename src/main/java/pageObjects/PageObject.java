package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
blic PageObject(AndroidDriver<MobileElement> driver
public class PageObject {
	protected AndroidDriver<MobileElement> driver;

	pu) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);

	}
}
