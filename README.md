# Jogo de Adivinhação com RMI (Remote Method Invocation)

## Descrição
Este é um jogo simples de adivinhação implementado em Java utilizando a tecnologia RMI (Remote Method Invocation). O jogo consiste em adivinhar um número aleatório gerado pelo servidor.

## Componentes do Projeto

### Código 1: `Server.java`
Este arquivo contém a implementação do servidor RMI. Ele gera um número aleatório e oferece um método remoto para os clientes adivinharem o número.

### Código 2: `Client.java`
O cliente interage com o servidor RMI. Ele solicita que o usuário insira um palpite e exibe se o palpite está correto, alto ou baixo em relação ao número gerado pelo servidor.

### Código 3: `AdvinhacaoInterface.java`
Este arquivo define a interface remota que o servidor implementa e o cliente utiliza para invocar métodos no servidor.

### `my.policy`
Este arquivo especifica a política de segurança para o projeto. Neste caso, todas as permissões são concedidas. Em um ambiente de produção, isso deve ser configurado com permissões adequadas.

## Como Jogar
1. Execute o servidor RMI primeiro executando `Server.java`.
2. Em seguida, execute `Client.java` para iniciar um cliente.
3. O cliente solicitará que você insira um número entre 1 e 100.
4. Após cada palpite, o cliente exibirá se o palpite está correto, alto ou baixo.
5. Continue adivinhando até acertar o número ou até decidir sair digitando `-1`.

## Instruções de Compilação e Execução
1. Compile todos os arquivos `.java`.
2. Inicie o servidor executando `Server.java`.
3. Inicie o cliente executando `Client.java`.

Certifique-se de que o RMI Registry esteja em execução e que não haja conflitos de porta.

## Requisitos
- JDK (Java Development Kit)
- Conexão com a Internet (para acessar o RMI Registry local)

## Autor
Este projeto foi desenvolvido por roninroxin.

