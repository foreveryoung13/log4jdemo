package com.java.sample;

import org.apache.log4j.Logger;

public class MainClass {

	final static Logger logger = Logger.getLogger(MainClass.class);

	public static void main(String[] args) {
		runMe("Nana");
	}

	private static void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}
}
