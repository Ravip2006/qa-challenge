package com.testcode.demo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public abstract class BaseClassTest {

	@BeforeClass
	public static void setup(){
		String port = System.getProperty("server.port");
		if(port == null){
			RestAssured.port = Integer.valueOf(8080);
		}
		else{
			RestAssured.port = Integer.valueOf(port);
		
		}
		String basePath = System.getProperty("server.base");
		if(basePath == null){
			basePath = "/v2.0/";
		}
		RestAssured.basePath = basePath;
		
		String baseHost = System.getProperty("server.host");
		if(baseHost == null){
			baseHost = "https://api.weatherbit.io";
		
		}
		RestAssured.baseURI = baseHost;
		
	}



}
