package com.learnLog4j;

import java.io.ObjectInputStream.GetField;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.learnLog4j.manager.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
	private static org.apache.log4j.Logger log = Logger.getLogger(App.class);
	

	public static void main(String[] args) {

		log.setLevel(Level.INFO);
		/*log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");*/
		 // %d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
		//2016-03-03 23:14:29 INFO   App:14 - Info Message!
		/**
		 * d -> represents the date
		 * p->priority of the logging event (like INFO ,WARn, etc.,)
		 * %L->Used to output the line number from where the logging request was issued.
		 * %c{1} -> For example, for the class name "org.apache.xyz.SomeClass", the pattern %C{1} will output "SomeClass".
		 * %m ->Used to output the application supplied message associated with the logging event.
		 * %n -> Outputs the platform dependent line separator character or characters.
		 * 
		 */
		LogManager.warn("Warn Message!"," App");
		LogManager.info("Info Message!"," App");
		LogManager.severe("Fatal Message!"," App");
		
		App1.method1();
		
		
	}

}
