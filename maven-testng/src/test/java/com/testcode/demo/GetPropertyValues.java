package com.testcode.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValues {
	
	public String getPropValues() throws IOException{
		String result = "";
		Properties prop = new Properties();
		String propFileName = "config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		if(inputStream!=null){
			prop.load(inputStream);
		}else{
			throw new FileNotFoundException("property'" + propFileName +"'not found in the classpath");
		}
		result = prop.getProperty("Api_Key");
		System.out.println(result);
		return result;
	}

}
