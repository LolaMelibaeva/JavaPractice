package com.class01;

import java.io.File;
import java.net.URL;

public class TakesScreenShot {
	
	System.setProperty("webdriver, chromedriver.driver", "src/test/resources/driver/chromedriver.exe")
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitelyWait(10, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();
	
	Dimension dim=new Dimension();
	dim.setSize(1235)
	driver.get("url");
	
	
	
	
	public static String takesScreenshot (String filename) {
		
		TakesScreenshot =(TakesScreenshot)driver;
		File src=ts.getSreenshotAs(OutputType.FILE);
		
		String dest=System.getProperty("user.dir")+"/target/"+filename+".png";
		try {
		FileUtils.copyFile (src, dest);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dest;
	}
	
	List<WebElement> links=driver.findElements(By.tagname("a"));
	int linkSize=links.size();
	String urlLinks=links.getAttribute("href");
	String urlImg=links.getAttribue("img");
	
	URL obj=new URL(urlLinks);
	URL obj2=new URL(urlImg);
	
	UrlHTTPConnection conn=(UrlHTTPConnection)obj.openConnection();
	UrlHTTPConnection conn2=(UrlHTTPConnection)obj2.openConnection();
	int respCode=conn.getResponseCode;
	String respMess=conn.getResponseMessage();
	
	int respCode2=conn2.getResponseCode;
	String respMess2=conn2.getResponseMessage();
	
	if(respcode==200) {
		System.out.println("Link is valid: "+urlLinks+"->"+respCode+"-"+respMess);
		
	}else {
		System.out.println("Link is not valid: "+urlLinks+"->"+respCode+"-"+respMess);
	}
	
	

	
	
}
