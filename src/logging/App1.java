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

@SuppressWarnings("ALL")
public class App1 {

    public static void main(String[] args) {
        Logger logger; // apenas para exemplo de que foi importado com sucesso
    }
}
