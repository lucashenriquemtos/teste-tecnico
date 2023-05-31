# Acert Delivery

O Acert Delivery é um sistema simplificado para o controle de delivery de um restaurante. Ele foi desenvolvido com o objetivo de facilitar a realização de pedidos de comida por parte dos clientes, permitindo a entrega dos produtos em suas residências ou locais de preferência. Além disso, o sistema oferece recursos para o gerenciamento de clientes, pedidos e entregas, proporcionando uma experiência eficiente e conveniente tanto para o restaurante quanto para os clientes.

## Funcionalidades

- **Segurança**: O sistema oferece recursos de autenticação e segurança, permitindo que os usuários se cadastrem e façam login na aplicação. A autenticação é realizada por meio de tokens JWT (JSON Web Tokens), garantindo a proteção das informações e restringindo o acesso apenas a usuários autenticados. Dessa forma, somente os usuários logados podem executar os métodos das APIs disponíveis.

- **Clientes**: O Acert Delivery permite o cadastro, atualização, exclusão e consulta de informações dos clientes. Os usuários podem registrar novos clientes, atualizar dados existentes, remover clientes cadastrados ou obter informações sobre os clientes registrados no sistema. Essa funcionalidade possibilita um gerenciamento eficiente da base de clientes do restaurante.

- **Pedidos**: Com o Acert Delivery, é possível cadastrar, atualizar, excluir e consultar informações dos pedidos realizados pelos clientes. Um pedido obrigatoriamente precisa estar associado a um cliente registrado no sistema. Os usuários podem criar novos pedidos, atualizar os detalhes dos pedidos existentes, remover pedidos realizados ou obter informações sobre os pedidos registrados no sistema. Essa funcionalidade auxilia no controle e gerenciamento dos pedidos de delivery.

- **Entregas**: O sistema permite cadastrar, atualizar, excluir e consultar informações das entregas realizadas. Uma entrega necessariamente está vinculada a um pedido específico. Os usuários podem registrar novas entregas, atualizar detalhes das entregas existentes, remover entregas realizadas ou obter informações sobre as entregas registradas no sistema. Essa funcionalidade permite o controle eficiente das entregas realizadas pelo restaurante.

## Requisitos de Instalação

- Docker
- Java 8
- Postman

Certifique-se de ter o Docker, Java 8 e o Postman instalados em seu sistema antes de prosseguir.

## Como Rodar a Aplicação

1. Clone este repositório em sua máquina local.
2. Navegue até o diretório raiz da aplicação.
3. Execute o seguinte comando no terminal para construir a imagem Docker:
   ```
   docker build -t acert-delivery .
   ```
   Este comando irá construir a imagem Docker necessária para a aplicação.

4. Após o término da construção, execute o seguinte comando no terminal para iniciar a aplicação:
   ```
   docker run --name acert-delivery -d -p 8080:8080 acert-delivery
   ```
   Este comando irá iniciar um contêiner Docker com a aplicação.

5. Após a execução bem-sucedida, você poderá acessar a aplicação em [http://localhost:8080](http://localhost:8080).

## Como Acessar o Swagger

1. Certifique-se de que a aplicação esteja em execução.
2.

Abra um navegador da web.
3. Acesse o seguinte endereço:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```
   Isso abrirá a interface do Swagger, onde você poderá explorar e testar os endpoints da API de forma interativa.

## Como Testar a API usando o Postman

1. Abra o Postman em seu computador.
2. Certifique-se de que a aplicação esteja em execução.
3. Para autenticar na API, envie uma requisição POST para `http://localhost:8080/login` com o seguinte corpo (body):
   ```json
   {
       "login": "lucas",
       "senha": "123",
       "role": "admin"
   }
   ```
   Certifique-se de substituir os valores de "login", "senha" e "role" pelos dados de autenticação corretos.

4. A resposta da requisição irá incluir um token JWT. Copie o token para usar nas demais requisições autenticadas.

5. Use o Postman para enviar as requisições desejadas para a API, fornecendo o token JWT no cabeçalho de autorização das requisições que requerem autenticação. O cabeçalho de autorização deve ter o seguinte formato:
   ```
   Authorization: Bearer {seu_token_jwt}
   ```