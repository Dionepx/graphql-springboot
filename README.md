# projeto java com spring boot e graphql

projeto backend simples usando java 17, spring boot 3.5 e graphql para gerenciar posts e comentários em memória.

## tecnologias usadas

- java 17
- spring boot 3.5
- spring graphql
- maven

## como rodar

1. clone o repositório
   ```bash
   git clone https://github.com/seu-usuario/seu-projeto.git

2. entre na pasta do projeto
   cd seu-projeto

3. rode a aplicação
   ./mvnw spring-boot:run

## buscar post por id
query {
postById(id: "id-do-post") {
id
content
comments {
id
content
}
}
}

## criar post
graphql > Copiar > Editar

## criar comentário
mutation {
createComment(content: "comentário aqui", postId: "id-do-post") {
id
content
}
}
