package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App4 {

    private static final Logger LOGGER = LoggerFactory.getLogger("app4");

    public static void main(String[] args) {

        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");

        // Sem definir nenhum level no Logger app4 vai buscar acima que é o Logger ROOT que por padrão possui nível DEBUG, que pode ser alterado
        // assim como no exemplo em aula em que o ROOT estava com level warn e sobrescrevemos o app4 para nível trace, também é possível.
        // No nível dos appender quem comando é o Additivity, onde TRUE herda e FALSE não herda.

        // É uma boa prática, para os logs da aplicação, configurar sempre um ROOT Logger com o nível desejado e um appender opcionalmente.
        // Com objetivo de quando um logger não tiver uma configuração específica receber o padrão do ROOT Logger (que servirá como uma referência para outros Loggers)

    }
}
