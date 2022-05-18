Automação Sem Complicação WEB 2.0

Executar todos os cenários via linha de comando: mvn install
Executar 1 determinado cenário via linha de comando: mvn install -D cucumber.fillter.tags="@loginComSucesso"
Executar o cenário estár descrito no Runner ou todos (caso nenhuma tag tenha sido informada): mvn test
Executar em modo headless:  mvn install -D headless=true