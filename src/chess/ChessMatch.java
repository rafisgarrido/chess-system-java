package chess;

import boardgame.Board;
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

    //Metodo para receber as coordenadas do xadrez
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    //Metodo responsavel por iniciar a partida de xadrez
    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
