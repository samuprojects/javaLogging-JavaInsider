package theory;

@SuppressWarnings("ALL")
public class Introduction {

    /*
    *
    * Logging
    *
    * É a atividade de disparar mensagens de log para um destino qualquer e é importante para ter a informação sobre a execução de um determinado programa.
    * Exemplos: saber se há algum erro, se o fluxo está ocorrendo como esperado etc, através das mensagens de log.
    * ------------------------
    *    System.out
    *    System.err
    * ------------------------ utilizá-los não é um caminho viável porque são inflexíveis, possuem um conceito de tudo ou nada (ou faz log de tudo ou não faz log)
    * também não possuem customização de mensagens
    *  e sempre vão para um mesmo destino geralmente o console. Em produção normalmente é um arquivo ou dois destinos (o console e o arquivo)... ou ainda
    * determinadas mensagens vão para um arquivo, outras para o console ou outro arquivo
    * Pode desejar que quando um determinado arquivo alcançar uma tamanho começar outro e manter um backup dos anteriores, por exemplo.
    * Ou seja, tudo isso não é possível com system out/err
    *
    * Para isso devemos utilizar um framework de Logging, que visa justamente resolver os problemas de tudo ou nada
    *
    * Existem vários frameworks
    *
    * No curso será abordado a utilização do SLF4J (Simple Logging Facade for Java), que apesar de não ser um framework para logging, é uma fachada que abstrai
    * o uso de vários frameworks de logging, de forma que utilizaremos o framework Logback.
    * A combinação dos dois é comum no cenário global de desenvolvimento.
    *
    * */
}
