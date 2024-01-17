package theory;

@SuppressWarnings("ALL")
public class LogbackConcepts {

    /*
    *
    *                   Logback
    *
    *                             _ Level (info, debug, error, warning (warn) e trace)
    *                            /
    * App  --------------> Logger (gera as mensagens)
    *                        |
    *                        v
    *                      Appender (destino)    -------->   Encoder (transformar os logs em array de bytes, geralmente)
    *                                                           |
    *                                                           |
    *                                                           ------> Layout  (geralmente são texto e num padrão)
    *
    *                         Logback.xml
    *
    * Na prática, na aplicação, vamos interagir apenas com o Logger e Level o restante das configurações serão salvas num arquivo XML logback.xml
    *
    * */
}
