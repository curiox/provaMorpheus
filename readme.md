**Requisitos**
 * Maven 3+
 * SQL Server 2012+
 * SQL Server Management Studio
 * Angular 8.2.14
 * Angular Cli 8.3.24
 * NPM

**Instalação do Back-end**

Baixar o SQL Server (https://www.microsoft.com/pt-br/sql-server/sql-server-downloads) e o SQL Server Management Studio (https://docs.microsoft.com/pt-br/sql/ssms/download-sql-server-management-studio-ssms?redirectedfrom=MSDN&view=sql-server-ver15) e instalá-los.

No banco de dados local, criar o usuário "morpheus" e senha "morpheus" com autorização de super admin, e criar o banco de dados "provaMorpheus".

O Maven (https://maven.apache.org/) deve ser baixado e criar as variaveis de ambiente M2_HOME e MAVEN_HOME com a pasta onde o Maven foi extraido.

Com isso feito, extraia o projeto do back-end e execute o comando "mvn spring-boot:run" dentro do prompt de comando, quando ele estiver apontado para a pasta do projeto back-end.

**Instalação do Front-end**

Baixar o Node Package Manager (NPM) (https://www.npmjs.com/get-npm), e uma vez que ele esteja instalado, executar o comando "npm i(nstall) -g @angular/cli" para instalar o Angular Cli.

Extraia o projeto front-end e execute o comando "npm i(nstall)" no prompt de comando quando ele estiver dentro da pasta raiz do projeto. Uma vez terminado, basta executar o comando "ng serve".

**Execução do projeto**

Uma vez que ambos estejam online, basta acessar o endereço "localhost:4200" para acessar o projeto.