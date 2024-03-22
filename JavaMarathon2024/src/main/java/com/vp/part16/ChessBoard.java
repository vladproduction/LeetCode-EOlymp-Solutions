package com.vp.part16;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class ChessBoard {

    private ChessPiece [][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println();

        }
    }
}
