package logging;

public class ExLog {

    /*
    *
    * Exercício:
    * Criar as classes A e B com método log para uma mensagem qualquer.
    * As mensagens de log da ClassA devem ir para o console, as mensagens de log da ClassB devem ir para um arquivo.
    *
    * */
    public static void main(String[] args) {

        new ClassA().log();
        new ClassB().log();

    }
}
