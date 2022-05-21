#language: pt

  @CRUD
  Funcionalidade: Account CRUD

    @cadastroCRUD
    Cenario: Cadastro nova conta
      Dado que a pagina new account esteja sendo exibida
      Quando os campos de cadastro estiverem preenchidos com
        |username |chronosLeo            |
        |email    |chronosLeo@teste.com  |
        |password |Senha123              |
        |country  |Brazil                |
      Entao deve ser possivel logar no sistema após o cadastro

    @loginCRUD
    Cenario: Realizar login CRUD
      Dado que a modal esteja sendo exibida
      Quando os campos de login forem preenchidos com os valores
        |usuario  |chronosLeo           |
        |senha    |Senha123             |
        |remember |false                |
      Quando for realizado o clique no botao sign in
      Entao deve ser possivel logar no sistema

      @alteracaoCRUD
      Cenario: Realizar alteracao CRUD
        Dado que esteja logado no sistema com
          |usuario  |chronosLeo           |
          |senha    |Senha123             |
          |remember |false                |
        Dado que esteja na pagina de alteracao da conta
        Quando altero os valores dos seguintes campos
          |firstName  |ChronosNovoLeo     |
          |lastName   |Um                 |
        Quando for realizado o clique em salvar
        Entao a alteracao foi exibida na pagina myAccount

    @exclusaoCRUD
    Cenario: Realizar exclusao CRUD
      Dado que esteja logado no sistema com
        |usuario  |chronosLeo           |
        |senha    |Senha123             |
        |remember |false                |
      Dado que esteja na pagina MyAccount
      Quando for efetuado a acao do clique delete e em yes
      Entao o usuario deve ser deletado