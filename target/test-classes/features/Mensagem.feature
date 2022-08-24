# language: pt

  @Mensagem
  Funcionalidade: Enviar mensagem
    Eu como usuário
    quero enviar uma mensagem para contactar
    os desenvolvedores da página

    @Mensagem-com-sucesso
    Cenário: Enviar mensagem com sucesso
      Dado que estou na tela de contact us
      E preencho todos os campos
      Quando clico em enviar mensagem
      Então recebo feedback de envio de sucesso