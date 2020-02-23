import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class JDKLog {
    public static void main(String[] args) {
        Logger logger= Logger.getLogger("mylog");
        logger.info("Hello  World");
    }
}
