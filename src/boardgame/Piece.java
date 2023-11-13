package boardgame;

public class Piece {

    //Posicao simples da matriz que nao deve ser visivel
    protected Position position;
    private Board board;

    //A posicao inicial da peca considerada nula, como nao colocada, por isso nao ha construtor
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Nao permitido que o tabuleiro seja alteardo, por isso so getter
    //Somente classes e subclasses dentro do mesmo pacote poderao acessar o tabuleiro de uma peca
    protected Board getBoard() {
        return board;
    }
}
