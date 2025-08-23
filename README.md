# 🎮 Catálogo de Jogos - Back-end

## 📌 Sobre o projeto
Este é um projeto **back-end de um catálogo de jogos**, desenvolvido durante o **Intensivão de Java Spring Boot** ministrado pelo canal [DevSuperior](https://github.com/devsuperior/dslist-backend).  

O objetivo principal foi aplicar conceitos fundamentais de desenvolvimento back-end com **Java e Spring Boot**, construindo uma **API REST** estruturada em camadas, utilizando boas práticas de mercado.

---

## 🛠️ Tecnologias utilizadas
- ☕ **Java 21**
- 🌱 **Spring Boot**
- 🗄️ **H2 Database (banco em memória)**
- 📡 **API REST**
- 📦 **Maven** (gerenciamento de dependências)
  
## 🧭 Princípios e arquitetura do projeto
- 🔗 **Modelo Cliente/Servidor (HTTP e JSON)**
- 🏗️ **Spring REST**
- 🧩 **Mapeamento Objeto-Relacional (ORM - JPA/Hibernate)**
- 📐 **Arquitetura em camadas**
- 📤 **DTO (Data Transfer Object)**

---

## 📂 Estrutura do projeto
O sistema foi organizado seguindo boas práticas de arquitetura em camadas:

- **Entities** → Representam os objetos de domínio (ex.: `Game`).  
- **Repositories** → Camada de acesso ao banco de dados (JPA/Hibernate).  
- **Services** → Regras de negócio e orquestração da lógica.  
- **Controllers** → Pontos de entrada da API REST (expondo endpoints).  
- **DTOs** → Objetos para transferência de dados entre as camadas.
- **Projections** → serve para otimizar a consulta ao banco (menos dados carregados).
---

## ▶️ Como executar o projeto

### Pré-requisitos
- **Java 21+**
- **Maven**

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repo.git
   ```
2. Entre na pasta do projeto:
   ```bash
   cd nome-da-pasta
   ```
3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse no navegador ou ferramenta de testes (ex.: Postman):
   ```
   http://localhost:8080
   ```

### 🚀 Resolvendo problemas de dependência
Caso encontre erros de dependência ao rodar o projeto, utilize os comandos Maven:

```bash
# Limpa e baixa todas as dependências novamente
mvn clean install

# Executa o projeto com Spring Boot (baixa dependências automaticamente)
./mvnw spring-boot:run
```
---

## 📖 Endpoints principais
- `GET /games` → Retorna a lista de jogos  
- `GET /games/{id}` → Retorna um jogo específico pelo ID
- `GET /lists` → Retorna a lista de gênero de jogos
- `GET /lists/{id}/games` → Retorna uma lista de jogos de acordo com o id do gênero
- `POST /lists/{list_id}/replacement` → Substitui a posição de um jogo na lista, reordenando-o

---

## 📜 Créditos
Projeto desenvolvido como atividade prática no **Intensivão Java Spring Boot** do canal [DevSuperior](https://github.com/devsuperior).  
---
