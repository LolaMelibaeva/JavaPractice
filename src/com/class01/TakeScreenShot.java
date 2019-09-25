package com.class01;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

public class TakeScreenShot {		
		
	public static WebDriver driver;
		
		public static void setUp() {
			
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		String browser=ConfigsReader.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {		
		System.setProperties("webdriver.chromedriver.driver", "path to chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {		
			System.setProperty("webdriver.chromedriver.driver", "path to geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")) {		
			System.setProperty("webdriver.chromedriver.driver", "path to IEDriverServer.exe");
			driver=new InternetExploreDriver();
			}
			
		}else {
			System.out.println("browser is not valid");
		}
		
		
		driver.manage().timeouts().pageLoadTimeOut(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().windows().fullscreen();
		driver.get(ConfigsReader.getProperty("url"));
		
		
		
	}
	 public static void tearDown() {
		 driver.quit();
		
	}
	 }} 
	 public static String takeScreenshot() {
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File srcfile=ts.getScreenshotAs(OutputType.FILE);
		 String dest=new File("pathToScreenshot.image1.png");
		 FileUtils.copyFile(srcfile, dest);
		 
		 return dest;
		 
		 List <WebElement> links=driver.findElements(By.tagname("a"));
		 int linkSize=links.size();
		 
		 for (WebElement link: links) {
			 String urlLink=link.getAttribute("href");
			 
		 }
		 
		 try {
			 
			 URL obj=new URL(urlLink);
			 UrlHTTPConnection conn=(UrlHTTPConnection)obj.openConnection();
			 int respcode=conn.getResponseCode();
			 int message=conn.getResponseMessage();
			 if(respcode==200) {
				 System.out.println("Link is vald: "+urlLink);
			 }else {
				 System.out.println("Link is not valid: "+urlLink+"-->"+respcode+" - "+message);
			 }
			 
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 public FileInputStream fis;
		 public  XSSFWorkbook wb;
	    public XSSFSheet sheet;
		 public static void openExcelfile(String filepath, String sheetName) {
			 
		 try {
		 fis=new FileInputStream(filepath);
		 wb=new XSSFWorkbook(fis);
		 sheet=sheet.getSheet(sheetName);
		 
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 }
		 
		 public static int getRowNum() {
			 int row=sheet.getPhysicalNumberOfRows();
		 }
		 
		 public static int getColNum(int rowIndex) {
			 int col=sheet.getRow().getLastCellNum();
		 }
		 
		 public static String getCellData(int rowIndex, int colIndex) {
			 String cell=sheet.getRow(rowIndex).getCell(colIndex).toString();
			 return cell;
		 }
		 
		 Connection conn=DriverManager.getConnection(dburl, dbuser, dbpassword);
		 Statement st=conn.createStatement();
		 ResultSet result=st.executeQuery("select * from countries");
		 
		 while(result.next()) {
			 String columdata=result.getString("country_id");
			 String columdate=result.getString("country_name");
		 }
	 }