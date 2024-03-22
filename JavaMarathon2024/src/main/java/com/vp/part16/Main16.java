package com.vp.part16;

import static com.vp.part16.ChessPiece.*;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Main16 {
    public static void main(String[] args) {

//        testPrintingForEach();
        chessBoardPrint();

    }

    private static void chessBoardPrint() {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ROOK_BLACK,KNIGHT_BLACK,BISHOP_BLACK,QUEEN_BLACK,KING_BLACK,BISHOP_BLACK,KNIGHT_BLACK,ROOK_BLACK},
                {PAWN_BLACK,PAWN_BLACK,PAWN_BLACK,PAWN_BLACK,PAWN_BLACK,PAWN_BLACK,PAWN_BLACK,PAWN_BLACK},
                {EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
                {EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
                {EMPTY,EMPTY,EMPTY,PAWN_WHITE,EMPTY,EMPTY,EMPTY,EMPTY},
                {EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY},
                {PAWN_WHITE,PAWN_WHITE,PAWN_WHITE,EMPTY,PAWN_WHITE,PAWN_WHITE,PAWN_WHITE,PAWN_WHITE},
                {ROOK_WHITE,KNIGHT_WHITE,BISHOP_WHITE,QUEEN_WHITE,KING_WHITE,BISHOP_WHITE,KNIGHT_WHITE,ROOK_WHITE}
        });
        chessBoard.print();
    }

    private static void testPrintingForEach() {
        ChessPiece[] pieces = {
                PAWN_WHITE, PAWN_WHITE, PAWN_WHITE, PAWN_WHITE,
                ROOK_BLACK, ROOK_BLACK, ROOK_BLACK, ROOK_BLACK
        };

        for (ChessPiece chessPiece : pieces) {
            System.out.print(chessPiece.getRepresentation() + " ");
        }
    }
}
