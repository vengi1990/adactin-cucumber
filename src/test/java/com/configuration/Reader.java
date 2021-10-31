package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reader {
	public static Properties p;
	public Reader() throws Throwable {
		
		File f=new File("C:\\Users\\Vengatesh\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\property\\info.properties");
		FileInputStream fi=new FileInputStream(f);
		p=new Properties();
		p.load(fi);

	}
	public  String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getaddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String card_no() {
		String card_no = p.getProperty("card_no");
		return card_no;

	}
	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
