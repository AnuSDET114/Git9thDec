package utilities;

import java.io.FileInputStream;
import java.util.Properties;



public class ReadConfig {
	
	 Properties properties;
	
	String path = "C:\\Users\\nihar\\eclipse-workspace\\SeleniumAutomationFramework\\DSAlgoProject\\src\\test\\resources\\configfiles\\config.properties";
	
	//constructor
    public ReadConfig() {
    	try {
    	    properties = new Properties();
    
    	    FileInputStream fis = new FileInputStream(path);
    	    properties.load(fis);
    	    
    	 } catch (Exception e) {
    		 e.printStackTrace();
    	 }
    	
    	
    }
    public String getTestUrl()
    {
    	String value = properties.getProperty("testUrl");
    	
    	if(value!=null)
    		return value;
    	else
    		throw new RuntimeException("url not specified in config file");
    }
    
    public String getBrowser()
    {
    	String value = properties.getProperty("browser");
    	
    	if(value!=null)
    		return value;
    	else
    		throw new RuntimeException("url not specified in config file");
    }
    
    
    	
    	
    }

