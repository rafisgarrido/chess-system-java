package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    //classe responsavel pelas regras do xadrez

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        //Percorrer a matriz de pecas do meu tabuleiro e para cada peca do tabuleiro fazer um downcasting para ChessPiece
        for(int i = 0; i < board.getRows(); i++){//percorrer linha
            for(int j = 0; j < board.getColumns(); j++){//percorrer coluna
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    //Metodo responsavel por iniciar a partida de xadrez
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2 , 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7 , 4));
    }
}
