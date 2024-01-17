package theory;

@SuppressWarnings("ALL")
public class FrameworkOptions {

    /*
    *
    * Exemplos de Opções de Logging Frameworks do mercado
    * Logback
    * Reload4J
    * java.util.logging (nativo do Java)
    * entre outros
    *
    * o problema é que se trocar o framework tem que trocar tudo na aplicação por isso surgiu o SLF4J para os frameworks de logging
    * ele se integra nativamente com o Logback e possui adapters para os outros dois citados
    * Isso significa que na aplicação passamos a interagir apenas com o SLF4J que fará a interação com os demais frameworks
    *
    * A vantagem é que se quiser mudar de Logback para Reload4J, por exemplo, não haverá alteração no seu código.
    * A integração entre o SLF4J e Logback consiste em adicionar alguns JARs no ClassPath (estrutura da aplicação) para criar um Logger
    * que vai permitir enviar mensagens para ele que cuidará de muitas coisas por debaixo dos panos.
    *
    *
    * */
}
