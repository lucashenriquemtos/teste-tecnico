# Acert Delivery

## Descrição
O sistema é uma solução simplificada para o controle de delivery de um restaurante. Ele permite que os clientes realizem pedidos de comida para entrega em suas residências ou locais de preferência. O sistema facilita o gerenciamento dos clientes, pedidos e entregas, garantindo uma experiência eficiente e conveniente tanto para o restaurante quanto para os clientes.

## Funcionalidades
- **Segurança**: Permite que os usuários se cadastrem e façam login na aplicação usando autenticação via token JWT. Todos os métodos das APIs a seguir só podem ser executados se o usuário estiver autenticado.
- **Clientes**: Permite cadastrar, atualizar, excluir e consultar informações dos clientes.
- **Pedidos**: Possibilita cadastrar, atualizar, excluir e consultar informações dos pedidos. Todo pedido precisa ter um cliente associado, e cada cliente pode ter vários pedidos.
- **Entregas**: Permite cadastrar, atualizar, excluir e consultar informações das entregas. Toda entrega precisa estar vinculada a um pedido.


## Requisitos de Instalação
- Docker
- Java 8
- Postman

Certifique-se de ter o Docker, Java 8 e o Postman instalados em seu sistema antes de prosseguir.

## Como Rodar a Aplicação
1. Clone este repositório em sua máquina local.
2. Navegue até o diretório raiz da aplicação.
3. Execute o seguinte comando no terminal para construir e executar a aplicação usando o Docker:
   ```
   docker run --name teste-tecnico -d -p 8080:8080 teste-tecnico
   ```
   Este comando irá construir as imagens necessárias e iniciar os contêineres Docker para a aplicação.

4. Após a execução bem-sucedida, você poderá acessar a aplicação em [http://localhost:8080](http://localhost:8080).


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
