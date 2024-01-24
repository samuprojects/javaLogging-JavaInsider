package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(App2.class);

    public static void main(String[] args) {

        // O código permanece inalterado seguindo cada tipo de mensagem para seu respectivo tipo de log, porém, no XML podemos redefinir os níveis
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");

    }
}
