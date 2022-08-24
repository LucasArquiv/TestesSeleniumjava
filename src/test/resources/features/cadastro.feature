# language: pt

    @cadatro
      Funcionalidade: Cadastro de usuário
      Eu como novo usuário
      quero me cadastrar no site
      para poder fazer compras

      @cadastro-sucesso
      Cenário: Registrar novo ususário com sucesso
        Dado que estou na tela de login
        E acesso o cadastro de usuário
        Quando eu preencho o formulário de cadastro
        E clico em registrar
        Então vejo cadastro realizado com sucesso

      @validação-de-item
      Cenário: Validar valores e item visualizado na tela
        Dado que estou na tela de inicial
        E clico no item que quero adquirir
        Então então visualizo o item correto
