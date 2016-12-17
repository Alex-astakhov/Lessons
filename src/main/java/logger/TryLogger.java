package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 25.11.2016.
 */
public class TryLogger {
    private static Logger logger = LoggerFactory.getLogger(TryLogger.class);

    @Test
    public void testLog(){
        logger.info("Jack");
    }
}
