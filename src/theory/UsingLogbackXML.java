package theory;

@SuppressWarnings("ALL")
public class UsingLogbackXML {

    /*
    *
    * Utilizar o SLF4J integrado com o Logback sem realizar nenhuma configuração traz por padrão algumas coisas.
    * Porém o poder do Logback aparece quando você realiza sua própria configuração, pois a customização é o forte do Logback.
    *
    * Para fazer isso é necessário criar o arquivo logback.xml que deve fazer parte da estrutura do Classpath da aplicação (código fonte).
    *
    * Esse arquivo configura a API de Logback que estamos utilizando. a estrutura do arquivo pode ser obtida na internet e será explicada a seguir:
    *
    * configuration é a tag raíz onde definimos dentro os loggers e os appenders
    * um appender é um destino, um local para onde o logger vai, que no nosso exemplo foi chamado de CONSOLE.
    * Os appenders devem, além do nome, ter uma classe (class = ...) que implementa o comportamento do appender
    * Dentro do appender devemos ter um encoder (que também possui uma classe interna que no nosso exemplo transforma a saída de log em um padrão) ...
    *  e dentro dele um pattern que é o padrão da mensagem a ser exibida na tela.
    * Esse Pattern tem uma característica que é o uso de placeholders (%...) que identificam como as coisas devem aparecer (é um template para a mensagem)
    *
    * Baseado no exemplo abaixo caso não queira mostrar a thread basta remover o [%t], se quiser remover os milisegundos remover o .SSS
    * o padrão da saída será alterado para
    * 21:44:55 INFO  logging.App1 - This is my first log message!
    *
    *
    * <?xml version="1.0" encoding="UTF-8" ?>
      <configuration>
            <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
                <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
                    <Pattern>
                        %d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n
                    </Pattern>
                </encoder>
            </appender>

            <logger name="logging" level="info" additivity="false">
                <appender-ref ref="CONSOLE"/>
            </logger>

      </configuration>
    *
    *
    *
    * */
}
