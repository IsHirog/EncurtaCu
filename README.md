# EncurtaCu - Encurtador de URLs

EncurtaCu é um encurtador de URLs desenvolvido em Java com Spring Boot que permite criar links curtos, armazená-los e redirecionar corretamente para a URL original.

##  Funcionalidades
- Criar links curtos a partir de URLs longas
- Listar todos os links encurtados
- Redirecionar automaticamente para a URL original

## 🏗 Tecnologias Utilizadas
- Java 17+
- Spring Boot 3+
- Spring MVC (Thymeleaf)
- Spring Data JPA (Hibernate)
- MySQL 8+
- Bootstrap 5

## 📂 Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── dev/xoxo/EncurtaCu/
│   │       ├── controller/   # Controladores Spring MVC
│   │       ├── model/        # Entidades JPA
│   │       ├── repository/   # Repositórios Spring Data
│   │       ├── service/      # Lógica de negócio
│   │       └── EncurtaCuApplication.java  # Classe principal
│   └── resources/
│       ├── templates/        # Views Thymeleaf
│       └── application.properties  # Configurações
```

## ⚙️ Configuração do Banco de Dados

1. Criar o banco de dados no MySQL:
   ```sql
   CREATE DATABASE encurtacu;
   ```
2. Configurar as credenciais no `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/encurtacu
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   ```

## ▶️ Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/EncurtaCu.git
   cd EncurtaCu
   ```
2. Compile e execute o projeto:
   ```sh
   ./mvnw spring-boot:run
   ```
3. Acesse no navegador:
   ```
   http://localhost:8080
   ```

## 📌 Melhorias Futuras
- ✅ Validação de URLs
- 📊 Estatísticas de acesso
- 🔒 Autenticação de usuários
- ⏳ Expiração de links
- 🌍 API REST para integração

## 📜 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para contribuir! 🚀
