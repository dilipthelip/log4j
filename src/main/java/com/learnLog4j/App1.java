package com.learnLog4j;

import com.learnLog4j.manager.LogManager;

public class App1 {
	
	public static void method1(){
		
		LogManager.info("Logging from method1", "App1");
	}

}
