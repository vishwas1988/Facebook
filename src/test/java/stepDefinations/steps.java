package stepDefinations;

import java.time.Duration;
import java.util.ResourceBundle;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.en.*;
import pageObjects.SignUp;

public class steps {
	
	 WebDriver driver;
     SignUp su;
   

     //List<HashMap<String, String>> datamap; //Data driven

    // Logger logger; //for logging
     ResourceBundle rb; // for reading properties file
     String br; //to store browser name



    @Before
    public void setup()    //Junit hook - executes once before starting
    {
        //for logging
       // logger= LogManager.getLogger(this.getClass());
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");
     
    }

    @After
    public void tearDown() {
    
       driver.quit();
    }
	
	
	

	@Given("User launch browser")
	public void user_launch_browser() {
		 if(br.equals("chrome"))
	        {
	           driver=new ChromeDriver();
	        }
	        else if (br.equals("firefox")) {
	            driver = new FirefoxDriver();
	        }
	        else if (br.equals("edge")) {
	            driver = new EdgeDriver();
	        }
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Opens url {string}")
	public void opens_url(String url) {
		 driver.get(url);
	        driver.manage().window().maximize();
	}


	@When("user enters firstname as {string} and surname as {string}")
	public void user_enters_firstname_as_and_surname_as(String fname, String sname) {
		su=new SignUp(driver);
        
    	su.setFirstname("Vishwas");
       // logger.info("Provided Email ");
        su.setSurname("Thite");
        //logger.info("Provided Password ");
	}

	@When("user enters mobilenumber as {string} and password as {string}")
	public void user_enters_mobilenumber_as_and_password_as(String MoNo, String NewPass) {
		su.setMobileNo("9527436452");
        //logger.info("Provided Email ");
        su.setNewPass("1188@Vish");
        //logger.info("Provided Password ");
	}

}


