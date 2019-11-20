import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Chrome{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\IEDriverServer.exe");
	WebDriver d = new InternetExplorerDriver();
	
	d.get("http://www.greenstechnologys.com/selenium-course-content.html");
	
	String title = d.getTitle();
	System.out.println(title);
	 String l = d.getCurrentUrl();
	System.out.println(l);
	}
}
