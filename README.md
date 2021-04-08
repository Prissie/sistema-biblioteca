# Sistema Biblioteca 📚
Sistema desenvolvido como desafio na DevSchool MJV

* API de uma Biblioteca com cadastro de usuários, livros e locações.

#### Grupo 3
                
+ [Mayza](https://github.com/mayzacatrinck)
+ [Priscila](https://github.com/Prissie)


### Estrutura do Projeto

Dividimos as classes em pacotes de acordo com suas responsabilidades.

* Model: onde definimos os modelos ou seja as classes dos objetos que usamos no sistema
* Repository: onde definimos o JPA para acessar os dados do BD
* Service: onde definimos as regras de negócio para manipulação dos Models
* Dto: onde definimos as classes em que serão consumidas e enviadas pelo frontend
* Controller: também chamado de Resource foi onde definimos a interação do frontend com a API por meio da definição dos endpoints
* Exception: onde definimos nossas exceções
* Configuration: onde definimos as configurações do Swagger para documentar a API, a segurança do Spring Security e JWT

![Estrutura do Projeto](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/imagens/Estrutura%20projeto.png)

#### Descrição do projeto

A descrição do projeto pode ser acessada [aqui](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/src/assets/Back%20-%20Biblioteca.docx.pdf)

### Na pagina do Swagger estará disponível e exibindo todos os recursos da API.

#### Cadastros

![Swagger Cadastro Usuário](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/imagens/swagger_cadastro.PNG)

#### Login

![Swagger Login](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/imagens/swagger_login.PNG)

#### Livros

![Swagger Login](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/imagens/swagger_livro.PNG)

#### Locação

![Swagger Login](https://github.com/MJV-Grupo3/sistema-biblioteca/blob/main/imagens/swagger_locacao.PNG)

A documentação da API pode ser acessada em [Heroku Swagger](https://sistema-biblioteca-mjv.herokuapp.com/swagger-ui.html#)
