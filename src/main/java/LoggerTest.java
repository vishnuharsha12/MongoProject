import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest
{
    public static Logger LOGGER= LogManager.getLogger("LoggerTest.class");

    public static void main(String[] args) {
        LOGGER.debug("I am Debug");
        LOGGER.info("I am Info");
        LOGGER.warn("I am warning message");
        LOGGER.fatal("I am Fatal");
        LOGGER.error("I am error");
    }
}
