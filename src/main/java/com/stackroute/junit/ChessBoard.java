package main.java.com.stackroute.junit;
/*
generating the chess board
 */

public class ChessBoard {
    public String[][] getChessBoard(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {//placing ww in white positions and BB in odd positions
                        output[i][j] = "WW";
                    } else {
                        output[i][j] = "BB";
                    }

                }


            }

            return output;
        }
    }
}
