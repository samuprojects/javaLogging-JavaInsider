package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App3 {

    private static final Logger LOGGER = LoggerFactory.getLogger("x.y");

    public static void main(String[] args) {

        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");

        // como o Logger x.y não tem level definido herda de x, já no appender vai exibir somente o console 2 porque o Additivity = FALSE
        // se deixar o padrão TRUE as mensagens serão duplicadas porque serão enviadas ao console 1 também
    }
}
