package log4j;

import org.apache.log4j.Logger;

import step01.jsoup.fassionPlus;

public class Log4j {
	private static Log4j instance = new Log4j();
	
	public static Log4j getInstance() {
		return instance;
	}
	
	private final Logger logger = Logger.getLogger(fassionPlus.class);

	public void logTest(String msg) {
		try {
			logger.info(msg);
		}catch(Exception e) {
			logger.error("got error",e);
		}
	}
}
