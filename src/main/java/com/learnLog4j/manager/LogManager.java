package com.learnLog4j.manager;

import org.apache.log4j.Logger;

public class LogManager {
	
	private static Logger logger = Logger.getLogger(LogManager.class.getName());
	private static String className = "";
	


	public static void info(String msg, String loggerClass) {
			logger = Logger.getLogger(loggerClass);
			logger.info(msg);
	}
	
	public static void severe(String msg, String loggerClass) {
			logger = Logger.getLogger(loggerClass);
			logger.fatal(msg);
	}
	
	public static void warn(String msg, String loggerClass) {
			logger = Logger.getLogger(loggerClass);
			//createLogger(loggerClass);
			logger.warn( msg);
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		LogManager.logger = logger;
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		LogManager.className = className;
	}
	
	
	
	

}
