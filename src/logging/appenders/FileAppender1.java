package logging.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileAppender1 {

    // File Appenders são direcionamentos para arquivos, bastante utilizados no contexto de logs
    // a classe muda para FileAppender, o target não existe, a parte de cores também não é suportada em arquivos, necessário informar o caminho na tag file
    // no arquivo de log, por padrão, sempre será executado o conceito de append no final do arquivo garantindo um histórico das mensagens,
    // porém se incluir explicitamente uma tag append com a propriedade em false vai sempre escrever o mesmo arquivo só com as últimas mensagens
    // outra propriedade que vem como true é o immediateFlush que grava imediatamente as informações de log no arquivo, se mudar para false ficará na memória para ser salvo de uma só vez depois
    // aqui vale uma ATENÇÃO se o cenário é de uma aplicação com muitas mensagens de log talvez seja interessante manter como false, pois
    // operações de IO em arquivos são muito custosas computacionalmente. A desvantagem é que se a aplicação travar esses logs em memória serão perdidos.
    // É necessário avaliar o cenário que se espera obter, o balanço entre DESEMPENHO X CONSISTÊNCIA, mais desempenho menos consistência, consistência máxima pode reduzir o desempenho
    // De modo geral o immediateFlush fica ligado e o contrário ocorre em situações extremas onde há a escrita de arquivos (IO) em quantidade absurda em um curto espaço de tempo.

    private static final Logger LOGGER = LoggerFactory.getLogger(FileAppender1.class);

    public static void main(String[] args) {
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");
    }
}
