package theory;

@SuppressWarnings("ALL")
public class LoggerHierarchies {

    /*
    *
    * Não é obrigatório utilizar hierarquias em Loggers, porém, é possível fazê-lo utilizando um ponto como separador no arquivo do logback.xml
    * Todos os Loggers herdam de Root, e cada Logger tem seus respectivos Levels e Appenders, incluindo o próprio Root.
    * Supondo que um Logger P não tenha um level, o Logback vai buscar nos níveis mais acima o que estiver disponível
    * Se quiser que determinado Logger em nível mais abaixo herde os appenders dos níveis acima basta manter o Additivity no padrão TRUE,
    * do contrário de alterar explicitamente para false o Logback vai considerar apenas os appenders específicos desse Logger
    * Exemplo:
    * Additivity = TRUE (que é o padrão implícito)
    * se tiver um Logger X com appenders para o CONSOLE e;
    * um outro Logger Y com appenders para FILE;
    * o Logger P, por exemplo, mais abaixo exibiria os appenders CONSOLE + FILE + os appenders de P se houver.
    *
    * Com Additivity = FALSE somente o que há em P
    *
    *                                                 Level                                     Logback.xml hierarquia
    *                                               /                                             X
    *                                 Logger ROOT --                                              X.Y
    *                                          |    \ Appenders                                   X.Z
    *                                          |                                                  X.Y.P
    *                                          V
    *                                   Logger X (com seus Level + Appenders (CONSOLE))
    *                                        / |
    *                                      /   |
    *                                    /     |--> Logger Y (com seus Level + Appenders (FILE))
    *   Logger Z (Level + Appenders) <--|              |
    *                                                  |
    *                                                  V
    *                                                Logger P (Level + Appenders (CONSOLE + FILE))
    *                                                                            se Additivity = TRUE
    * */
}
