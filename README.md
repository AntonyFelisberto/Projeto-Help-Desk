# Projeto Help Desk

Comandos FRONT

npm i --save ngx-mask : dependencia para fazer mascaras como a de cpf

ng g s nome : vai criar um serviço
ng g s nomeDaPasta/nomeDoService

ng g c nome : vai gerar um component de exibicoes
ng g c nomePasta/nomeArquivo

ng g guard nome : ira gerar um guarda que ativa as rotas somente a partir de certa condição do token
    escolher - can activate
    adicione a dependencia do jwt para verificação de tokens
        npm i @auth0/angular-jwt --save

ng g interceptor interceptador : vai gerar um inteceptados de envios rest, é ele quem insere header que voce especifica
ng g interceptor  nomeDaPasta/nomeDoService


npm i ngx-toastr: é usado para mostrar notificações mais pequenas ao usuario

Comandos BACK

gerando jar do back
    mvn clean install
    dir
    cd
    java -jar nomeDoJarGerado-versaoApresentada-SNAPSHOT.jar exemplo (amazonApi-0.0.1-SNAPSHOT.jar)
 
