package com.class01;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;

public class TakesScreenShot3 {
	
	public static String takesScreenShot (String filename) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+"/src/test/screenshots/"+filename+".png";
	try {
	FileUtils.copyFile (src, new File(dest));
	}catch (Exception e){																				
		e.printStackTrace();
	}
	
	return dest;
	}
	
	List<WebElement> links=driver.findElements(By.tagname("a"));
	int linkSize=links.size();
	for (WebElement link: links) {
		String urlLinks=link.getAttribute("href");
		
		if(urlLinks!=null) {
			URL obj=new URL(urlLinks);
			UrlHTTPConnection conn=(UrlHTTPConnection).obj.openConnection();
			int respCode=conn.getResponseCode();
			int respMessage=conn.getResponseMessage();
			if (respCode==200) {
				System.out.println("Valid Links "+urlLinks+"-->"+respMessage);
			}else {
				System.out.println("Invalid links")+urlLinks+"-->"+respMessage);;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
