package yusiftask;

import java.util.Random;

public class First {
    public static void main(String[] args) {
        String[][] board = new String[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "-";
                //System.out.println(board[i][j]);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
