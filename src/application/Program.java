package application;

import boardgame.Board;
import chess.ChessMatch;


public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        //Para imprimir as pecas da partida
        UI.printBoard(chessMatch.getPieces());
    }
}
