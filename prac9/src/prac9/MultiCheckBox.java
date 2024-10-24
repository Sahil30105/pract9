package prac9;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiCheckBox {
	static String driverpath = "D:\\geckodriver.exe";

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SahilGupta\\tycs\\STQA\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String appurl = "file:///D:/SahilGupta/tycs/STQA/multicheckbox.html";
		driver.get(appurl);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkedcount = 0, unchecked = 0;
		for (int i = 0; i < checkbox.size(); i++) {
			if (checkbox.get(i).isSelected()) {
				System.out.println("Checkbox " + (i + 1) + " is selected.");
				checkedcount++;
			} else {
				System.out.println("Checkbox " + (i + 1) + " isn't selected.");
				unchecked++;
			}
		}
		System.out.println("Total number of selected checkboxes: " + checkedcount);
		System.out.println("Total number of unselected checkboxes: " + unchecked);
		System.out.println("Total number of checkboxes: " + checkbox.size());
	}
}
