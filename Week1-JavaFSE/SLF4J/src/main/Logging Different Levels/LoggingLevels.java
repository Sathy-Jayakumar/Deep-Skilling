import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingLevels {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingLevels.class);

    public static void main(String[] args) {

        logger.trace("Trace Message");

        logger.debug("Debug Message");

        logger.info("Information Message");

        logger.warn("Warning Message");

        logger.error("Error Message");

    }

}