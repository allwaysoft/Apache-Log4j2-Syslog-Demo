import org.apache.logging.log4j.*;

public class TestLog4j {

	private static final Logger logger = LogManager.getLogger(TestLog4j.class);

	public static void main(String[] args) throws Exception {
		logger.debug("Mydebug message");
		logger.info("Myinfo message");
		logger.warn("Mywarn message");
		logger.error("Myerror message");
		try {
			int i = 1 / 0;
		} catch (Exception exc) {
			logger.error("error message with stack trace", new Exception("I forced this exception", exc));
		}
		logger.fatal("fatal message");
	}

}