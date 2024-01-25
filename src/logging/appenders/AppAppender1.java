package logging.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppAppender1 {

    // é possível direcionar a mensagem padrão para o System.out ou System.err por meio da tag <target>

    private static final Logger LOGGER = LoggerFactory.getLogger(AppAppender1.class);

    public static void main(String[] args) {
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");
    }


}


