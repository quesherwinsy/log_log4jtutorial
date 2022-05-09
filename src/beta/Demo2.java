package beta;

import org.apache.logging.log4j.*;

public class Demo2 {

	// log4j initialize log object
	private static Logger log = LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("hello");

		int i = 5;

		if (i > 4) {
			log.debug("success debug object is present");
			log.info("success info object is present");
			log.error("error error object is not present");
			log.fatal("error fatal object is not present");
		} else {
			log.error("error error object is not present");
			log.fatal("error fatal object is not present");
		}
	}

}
