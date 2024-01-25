package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App7 {

    // Para evitar a execução de código desnecessário e que venha atrapalhar computacionalmente a aplicação utilizar o isInfoEnable
    // ou qualquer outro level nessa categoria de métodos boolean disponíveis, para evitar que determinado log seja executado e a mensagem descartada por ser de outro nível

    private static final Logger LOGGER = LoggerFactory.getLogger("app7");

    public static void main(String[] args) {

        if (LOGGER.isInfoEnabled()) { // uma outra forma seria utilizar LOGGER.isEnableForLevel(Level.INFO) , ou outro nível se for o caso
            LOGGER.info("Result: {}", calculate());
        }
    }

    private static int calculate() { // esse método vai fazer a Thread dormir por 2 segundos antes de executar o cálculo
        System.out.println("Calculating..."); // mensagem apenas para mostrar que o método foi chamado
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 10; // no contexto de log a mensagem será perdida após o Logback verificar que não é do mesmo level perdendo desempenho ao chamar o método desnecessariamente
    }
}
