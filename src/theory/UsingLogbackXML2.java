package theory;

@SuppressWarnings("ALL")
public class UsingLogbackXML2 {

    /*
    * <Pattern>
          %d{HH:mm:ss} %-5level %logger{36} - %msg%n
      </Pattern>
    *
    * o -5 antes do level garante que vai utilizar o level com 5 casas (posições) alinhado do lado esquerdo, ou seja, pensando no log DEBUG que tem 5 letras o espaçamento será
    * igual mesmo que seja um log de INFO, que só possui 4 letras.
    *
    * o resultado é um alinhamento independente do tipo de log que é preenchido com espaços em branco como no exempplo a seguir
    * 21:56:47 INFO  logging.App1 - This is my first log message!
    * 21:56:47 DEBUG logging.App1 - This is a debug message
    *
    * caso mude o Pattern removendo o -5 por 10 será acrescido 10 posições alinhado a direita mudando o padrão para
    * 22:01:26       INFO logging.App1 - This is my first log message!
    * 22:01:26      DEBUG logging.App1 - This is a debug message
    *
    * 0 %n no final é a quebra de linha se removido todos os logs serão exibidos na mesma linha o que não é ideal
    * 22:04:00       INFO logging.App1 - This is my first log message!22:04:00      DEBUG logging.App1 - This is a debug message
    *
    *
    * O 36 depois do logger é o tamanho máximo da classe, ou seja, o framework tentará abreviar o tamanho da classe se ultrapassar 36 caracteres
    * (vai cortar, de forma inteligente, os nomes dos pacotes (do fully qualified name da classe) para que não fique muito grande).
    *
    * na tag logger o nomde do logger é logging porque o pacote da aplicação tem esse nome (será explicado posteriormente a hierarquia dos loggers)
    * cada logger tem um nome e respeitam uma hierarquia
    * quando definimos um logger como logging tudo que for logado no pacote logging vai receber a configuração do nosso exemplo
    *
    * o level da tag logger se refere aos níveis (info, debug, error, warning) mas que não significa que será logado apenas info, mas que alguns ficarão de fora
    *
    * o additivity indica se o logger deve herdar os appenders que foram colocados nos loggers acima da hierarquia (será explicado depois)
    *
    * Dentro do logger podemos configurar um ou mais appenders utilizando a tag de appender-ref passando o nome do appender que foi configurado
    * no nosso exemplo temos apenas o "CONSOLE"
    * Ou seja, observando a estrutura primeiro configuramos os appenders e nos loggers
    * referenciamos, para cada logger que configuramos, quais serão os appenders que o respectivo logger vai utilizar
    *
    * Com isso conseguimos direcionar cada logger para os seus destinos (appenders) e cada destino utilizando o seu padrão.
    *
    * */
}
