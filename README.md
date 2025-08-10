# wally-helper
API REST construída com Quarkus para gerenciamento e consulta de credenciais, ideal para fornecer valores dinâmicos de forma segura para outros serviços.

## 🚀 Funcionalidades

- Armazena e gerencia credenciais de forma centralizada.

- Permite consulta de valores dinâmicos via endpoints REST.

- permite marcar uma credencial como expirada

## 📦 Instalação / Execução local
```bash
./mvnw quarkus:dev
```
A aplicação estará disponível em:
http://localhost:8080

## 🔧 Configuração
Defina as variáveis de ambiente no arquivo application.properties:

``` properties
quarkus.http.port=8080
wally.security.apikey=MINHA_CHAVE_DE_API
```