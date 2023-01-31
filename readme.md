Readme - Usando o código JSON com Postman

Este código JSON representa um registro de informações de uma pessoa, incluindo seu nome, CPF, RG, data de nascimento, estado civil, telefone e email. Este arquivo pode ser usado com o Postman para fazer solicitações HTTP para uma API.

#Como usar o código JSON com o Postman

1.Abra o Postman.

2.Clique no botão "Nova solicitação".

3.Selecione o método HTTP desejado (por exemplo, POST).

4.Na seção "URL", insira a URL da API para a qual você deseja fazer a solicitação.

5.Clique na guia "Corpo".

6.Selecione o tipo de dados "JSON (application/json)".

7.Cole o código JSON na área de texto.

8.Clique no botão "Enviar" para enviar a solicitação.

Agora você pode ver a resposta da API na guia "Resposta". Verifique se a resposta é a esperada e se os dados foram armazenados corretamente.

Observação: é importante verificar a documentação da API para saber quais são os dados obrigatórios e os tipos de dados esperados para cada campo. Além disso, certifique-se de que a URL da API está correta antes de enviar a solicitação.

Exemplo:

{

"id": 2,

"name": "Maria Souza",

"cpf": "22222222222",

"rg": "222222222",

"dataNascimento": "1995-05-20T00:01:01.000Z",

"estadoCivil": "casado",

"telefone": "999999999",

"email": "maria.souza@email.com"

}
