package logging.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileAppender2 {

    // Existem cenários em que é interessante incluir no nome do arquivo a data em que foi gerado, podendo, por exemplo, ter um arquivo de log por dia, por hora, por mês, etc.
    // Para isso, fora da tag do appender, em configuration, utilizar a tag timestamp passando 2 valores, key (que é o valor que será referenciado no arquivo de log)
    // Ou seja, a chave pode ser qualquer coisa, mas que deve ser referenciado, exemplo "dateTimeFormat"
    // E o segundo valor a ser passado é o datePattern que será o padrão da data seguindo as convenções do Java
    // Depois na tag file do appender incluir no caminho a referência com o valor da key no padrão ${valorDaKeyAqui}
    // Como escolhemos hora e minuto o Java vai fazer um parse da hora atual do sistema e acrescentando no nome do arquivo
    // Enquanto estiver no mesmo minuto será feito os appends no log atual e quando mudar para o minuto seguinte será criado outro arquivo de log
    // Se quiser criar por mês basta mudar o valor de datePattern para MM, por exemplo, enquanto for o mês 01 será salvo num arquivo apenas.

    private static final Logger LOGGER = LoggerFactory.getLogger(FileAppender2.class);

    public static void main(String[] args) {
        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");
    }

}
