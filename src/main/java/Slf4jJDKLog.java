import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jJDKLog {
final static Logger logger = LoggerFactory.getLogger(Slf4jJDKLog.class);
public static void main(String[] args) {
logger.trace("Trace Level.");
logger.info("Info Level.");
logger.warn("Warn Level.");
logger.error("Error Level.");
}
}