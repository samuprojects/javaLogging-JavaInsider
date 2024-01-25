package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App6 {

    // como fazer o log de uma exceção
    // preferencialmente utilizar o método error e, além de passar a mensagem que descreve o problema, passar o objeto da exceção se o tiver fazendo com que a stacktrace seja logada

    private static final Logger LOGGER = LoggerFactory.getLogger("app6");

    public static void main(String[] args) {

        try {
            throw new RuntimeException("Ops!");
        } catch (RuntimeException e) {
            LOGGER.error("Error: " + e.getMessage(), e); // Passar um Throwable como 2º parâmetro é interessante, pois todas as exceções o implementam
        }
    }
}
