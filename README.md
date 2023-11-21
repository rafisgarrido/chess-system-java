# Sistema de Jogo de Xadrez em Java

Este é um projeto de implementação de um sistema de jogo de xadrez em Java, utilizando conceitos de Programação Orientada a Objetos.


## Descrição do Projeto

O objetivo deste projeto é criar um sistema de jogo de xadrez totalmente funcional, onde os jogadores podem jogar partidas de xadrez e o sistema valida as jogadas de acordo com as regras do jogo. A implementação segue os princípios da Programação Orientada a Objetos para garantir uma estrutura modular e reutilizável.


## Funcionalidades Principais

- Representação dos diferentes tipos de peças de xadrez como objetos.
- Tabuleiro dinâmico que armazena a posição das peças.
- Validação de movimentos de acordo com as regras do xadrez.
- Controle de turnos e lógica de jogo.
- Tabuleiro Interativo: Representação gráfica e interativa do tabuleiro de xadrez.
- Movimentação de Peças: Implementação de regras de movimentação para cada tipo de peça.
- Validação de Movimentos: Verificação de movimentos legais de acordo com as regras do xadrez.
- Partidas e Jogadores: Controle de partidas entre dois jogadores.
- Xeque-Mate, En pasant e Promotion: Identificação de situações de xeque-mate e movimentos especiais como En Pasant e Promotion.


## Estrutura do Projeto

O projeto está estruturado da seguinte forma:


- `Program.java`: O ponto de entrada do programa, onde o jogo é inicializado.
- `chess/`: Pacote que contém as classes relacionadas ao jogo de xadrez.
  - `Board.java`: Representa o tabuleiro do jogo.
  - `ChessPiece.java`: Classe base para todas as peças de xadrez.
  - `King.java`, `Queen.java`, ...: Classes específicas para cada tipo de peça.


## Contribuições

Contribuições são bem-vindas! Se você identificar melhorias, correções de bugs ou novas funcionalidades que possam enriquecer o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.


## Inspiração

Este projeto foi elaborado através do Curso: Programação Orientada a Objetos com Java (http://educandoweb.com.br) Prof. Dr. Nelio Alves
