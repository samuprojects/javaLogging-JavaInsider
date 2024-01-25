package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App5 {

    // como passar parâmetros nas mensagens dos logs que serão enviados aos Loggers

    private static final Logger LOGGER = LoggerFactory.getLogger("app5");

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // ao invés de concatenar, todos os métodos de Logger que disparam mensagens aceitam mensagens parametrizadas
        LOGGER.info("x = " + x + "; y = " + y);

        LOGGER.info("X = {}; Y = {}", x,y); // {} no lugar dos parâmetros e após informar os parâmetros separadamente (é a melhor opção)

        /*
        * isso porque quando passamos os parâmetros o Logback pode otimizar a criação dessa mensagem de log
        *
        * Por exemplo, se o nível INFO estiver desabilitado, com a concatenação o Java vai primeiro montar a String inteira buscando os valores de x y
        * para depois, quando o método for chamado internamente a mensagem será descartada porque não é compatível com aquele log
        *
        * Já com a segunda opção é mais otimizada, pois a mensagem e os parâmetros estão separados, quando o Logback avaliar o cenário
        * nem juntará os parâmetros porque já avaliou a mensagem e será descartada, economizando recursos em uma parte do processo
        *
        * Para uma aplicação corriqueira isso pode não ser percebido, mas a segunda opção é computacional e visualmente melhor.
        * */
    }
}
