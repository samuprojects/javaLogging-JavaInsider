package logging.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollingFileAppender1 {

    // o uso do RollingFileAppender é para arquivos com a característica de gerenciar automaticamente a geração de novos arquivos
    // a geração dos arquivos pode se basear em período, em tamanho de arquivos, etc
    // a classe do RollingFileAppender é a ch.qos.logback.core.rolling.RollingFileAppender
    // a tag file e a tag encoder não mudam a forma de utilização
    // o RollingFileAppender exige uma política de rolling (de rotação dos arquivos) e de uma TriggeringPolicy
    // no nosso exemplo será utilizado um rolling policy chamado TimeBasedRollingPolicy, que é uma política de rolling (de rotação de logs) baseada em tempo
    // existem outras que podem ser consultadas na documentação do Logback
    // A TimeBasedRollingPolicy exige a definição de um fileNamePattern (que é o padrão do nome do arquivo) que possui duas funções:
    // 1) Informar qual é o nome do arquivo de log e 2) Determinar quando que esse arquivo será arquivado
    // a tag maxHistory informa que será arquivado por determinado período de dias, por exemplo, após 30 dias os arquivos antigos serão apagados (sobrescritos)
    // a tag totalSizeCap determina o tamanho para os logs, se informar somente números será considerado bytes, no exemplo utilizado GB
    // a TimeBasedRollingPolicy também permite o arquivamento fazendo uma compactação dos arquivos de forma automática, por exemplo,
    //  no fileNamePattern rollingFile1.%d{yyyy-MM-dd}.log se mudar para rollingFile1.%d{yyyy-MM-dd}.zip será zipado, ou rollingFile1.%d{yyyy-MM-dd}.gz
    // para simular a compactação o fileNamePattern rollingFile1.%d{yyyy-MM-dd}.log foi alterado para salvar e compactar a cada minuto

    private static final Logger LOGGER = LoggerFactory.getLogger(RollingFileAppender1.class);

    public static void main(String[] args) {
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");
    }
}
