$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mensagem.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Enviar mensagem",
  "description": "Eu como usuário\r\nquero enviar uma mensagem para contactar\r\nos desenvolvedores da página",
  "id": "enviar-mensagem",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Mensagem"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Enviar mensagem com sucesso",
  "description": "",
  "id": "enviar-mensagem;enviar-mensagem-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@Mensagem-com-sucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que estou na tela de contact us",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "preencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clico em enviar mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "recebo feedback de envio de sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "MensagemSteps.que_estou_na_tela_de_contact_us()"
});
formatter.result({
  "duration": 11308674800,
  "status": "passed"
});
formatter.match({
  "location": "MensagemSteps.preencho_todos_os_campos()"
});
formatter.result({
  "duration": 979721600,
  "status": "passed"
});
formatter.match({
  "location": "MensagemSteps.clico_em_enviar_mensagem()"
});
formatter.result({
  "duration": 4809246500,
  "status": "passed"
});
formatter.match({
  "location": "MensagemSteps.recebo_feedback_de_envio_de_sucesso()"
});
formatter.result({
  "duration": 6070104600,
  "status": "passed"
});
});