package com.practice;

import java.util.Properties;

import org.openqa.selenium.devtools.v145.filesystem.model.File;

public class ReadDataFromProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 create object of fileinputstream and handle fileinputstreamexception
		File file= new File("C://users", null, null, null);
		//2craete object of filestrea and handle io exception
		fileInputstream fis=new fileInputstream(file);
		//3 create object of propertes class
		Properties property = new Properties();
		//4 call load()to load the fis in the properties object
		property.load(fis);
		//5 read the values using key from the properties file
		
		String writtenbrowser = property.getProperty("broswer");
		String url= property.getProperty("applicationurl");
		System.out.print(writtenbrowser);
		System.out.print(url);
		

	}

}
