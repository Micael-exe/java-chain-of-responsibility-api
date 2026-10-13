# 🚀 API de Validação com Chain of Responsibility

Projeto desenvolvido em Java utilizando o framework **Spring Boot** para demonstrar a aplicação prática do padrão de projeto comportamental **Chain of Responsibility**. 

O objetivo é evitar blocos gigantescos de `if/else` em regras de negócio, dividindo as validações de cadastro de usuários em elos (handlers) independentes, modulares e fáceis de manter.

## 🛠️ Tecnologias Utilizadas
- **Java 17/21**
- **Spring Boot**
- **Spring Web**
- **Maven**

## 🧩 Como Funciona o Padrão neste Projeto
O sistema intercepta uma requisição POST de cadastro de usuário e a submete a um pipeline de validação encadeado:
1. **Validador de Campos Obrigatórios:** Verifica se há campos vazios ou nulos.
2. **Validador de E-mail:** Valida se o formato do e-mail é válido (`@` e `.`).
3. **Validador de Senha:** Garante que a senha atenda ao tamanho mínimo exigido.

Se qualquer elo falhar, o fluxo é interrompido imediatamente e a API retorna um erro claro. Se passar por todos, o usuário é cadastrado com sucesso!

## ⚙️ Como Rodar o Projeto Localmente

1. Clone o repositório:
   ```bash
   git clone [https://github.com/Micael-exe/spring-chain-of-responsibility.git](https://github.com/Micael-exe/spring-chain-of-responsibility.git)
   Acesse a pasta do projeto pelo terminal:
   cd spring-chain-of-responsibility
   Execute a aplicação usando o Maven Wrapper:
   No Linux / macOS / Git Bash (Windows):Bash
   ./mvnw spring-boot:run
   No Windows (PowerShell):
   mvn spring-boot:run
   A API subirá localmente na porta 8080.

## 🧪 Como Testar a API
Você pode utilizar ferramentas como Postman, Insomnia ou extensões de testes HTTP no VS Code para enviar uma requisição POST para o endpoint:
Endpoint: http://localhost:8080/usuarios
Método: POST
Headers: Content-Type: application/json

## Exemplo de Corpo (Payload) Válido:
JSON
{
  "nome": "Micael Marcos",
  "email": "micael@email.com",
  "senha": "senhaSegura123"
}
## 👨‍💻 Autor
Feito com dedicação por Micael Marcos
