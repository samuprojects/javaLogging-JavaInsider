package logging;

/*
* Professor explicou para no Project Structure definir uma pasta src para Source do projeto onde ficará o código-fonte.
*
* Depois fora da src na estrutura do projeto (diretório raiz) criar um new Directory com nome libs.
*
* Em seguida colar os 3 JARs baixados anteriormente (logback-classic, logback-core e o slf4j).
*
* Depois informar ao Java que eles farão parte do Classpath do projeto, para isso clicar com o botão direito na pasta libs e selecionar
* Add as Library e ok.
*
* Para testar vamos trabalhar com o main abaixo
*
* */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("ALL")
public class App1 {

    // como normalmente não é necessário ter várias instâncias de Logger na aplicação geralmente se usa como um atributo estático dentro da classe que precisa do Logger
    // existem duas formas de criar um Logger no parâmetro do getLogger
    // 1) passar o nome do Logger (cada Logger sempre terá um nome) = getLogger(String name)
    // ou
    // 2) passar a classe do Logger (essa é a opção mais utilizada) = getLogger(Class<?> clazz)

    private  static final Logger LOGGER = LoggerFactory.getLogger(App1.class); // .class é um atributo que tem em toda classe do Java que retorna um objeto que representa aquela classe (lembrar da API Reflection do Java)

    // com base no nome da classe o Java vai usar o Logger com o nome da Classe, porque sempre tem um nome que é uma String (nesse caso extrai o nome da classe para ser usado no Logger)

    // importante nossa aplicação não pode conter nenhum import do Logback, porque ela vai interagir sempre diretamente com o SLF4J

    public static void main(String[] args) {

        // se quiser soltar uma mensagem de informação utilizar Logger.info passando a informação
        LOGGER.info("This is my first log message!");

        // o resultado foi alguma coisa como
        //         23:53:31.123 [main] INFO logging.App1 -- This is my first log message!
        // HORA/MIN/SEG/MILIS  +  [nome da THREAD principal] + INFO = nível da mensagem  + fully qualified name da classe + a mensagem

        // a seguir uma mensagem de Debug
        LOGGER.debug("This is a debug message");


        // se esse padrão não for o sufuciente para sua aplicação é possível criar e personalizar seu próprio arquivo Logback.xml responsável por isso
    }
}
