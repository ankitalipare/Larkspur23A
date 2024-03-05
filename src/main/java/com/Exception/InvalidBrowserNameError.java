package com.Exception;

public class InvalidBrowserNameError extends Error{

	String msg;
	public InvalidBrowserNameError(String browserName) {
		
		msg = "INVALID BROWSER NAME " + browserName;
 	}
	
	public String toString() {
		
		return msg;
	}
}
