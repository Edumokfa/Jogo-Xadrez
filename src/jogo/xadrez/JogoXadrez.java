package jogo.xadrez;

import chess.ChessMatch;

public class JogoXadrez {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
