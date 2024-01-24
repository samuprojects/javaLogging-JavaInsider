package theory;

@SuppressWarnings("ALL")
public class LogLevels {

    /*
    *
    * Cada logger tem um nível associado que basicamente definem que tipo de mensagem vão, ou não, ser enviadas para o logger.
    *
    * LOGGER LEVELS (seguindo a hierarquia estão dispostos abaixo do Maior para o Menor)
    *
    * nível TRACE (é um log onde temos um debug muito informativo, quase que linha a linha do programa)
    * nível DEBUG (é um log que contém informamos de debug do código para entender, por exemplo, determinado fluxo de execução e encontrar o problema)
    * nível INFO (é um log com mensagens informativas, geralmente mais leve que o debug, mas que são importantes)
    * nível WARN (é um log de aviso, não previne o programa de executar, para você fazer algo para melhorar, por exemplo).
    * nível ERROR (é um log com erros de execução, problemas que devem ser corrigidos na maior parte dos casos).
    *
    * OFF (desligado) = é um nível separado dos demais, significa que o logger não tem nível, tudo que for enviado para ele não aparecerá
    *
    * Exemplos:
    *
    * Logger X | INFO
    * pode exibir outras mensagens de logs dos níveis abaixo ERROR e WARN
    * DEBUG e TRACE não vão ser jogados para o appender
    *
    * Isso permite mostrar outros tipos de mensagens que tenham uma relação prática com o que estamos buscando.
    * Por exemplo, no código escolhemos o nível com base no que a mensagem significa no contexto do programa (erro para erro, info para info, etc).
    * Mas na configuração podemos escolher INFO para baixo, DEBUG para baixo, etc., de forma que sem alterar o código da aplicação podemos habilitar ou desabilitar algumas coisas.
    *
    * Exemplo: a aplicação está com um problema
    * podemos na configuração alterar o logger X de INFO para DEBUG, com isso todas as mensagens de DEBUG para baixo vão aparecer
    * não resolveu, pode modificar para o TRACE e ter ainda mais detalhes
    * ou... quero reduzir tudo, só ativar o ERROR (apenas os erros serão logados)
    * e senão quiser nada só mudar para OFF
    *
    * Essa decisão se a mensagem vai ou não para o appender depende do nível da mensagem que está sendo enviada, se é compatível com o nível do logger para onde a mensagem é enviada
    * (compatível do ponto de vista da hierarquia)
    * */
}
