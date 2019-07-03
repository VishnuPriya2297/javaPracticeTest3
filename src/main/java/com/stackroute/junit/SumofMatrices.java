package main.java.com.stackroute.junit;
/*
program to generate the sum of two matrices
 */

public class SumofMatrices {
    public int[][] checkSum(int rows, int colums, int a1[][], int a2[][]) {
        int sum[][] = new int[rows][colums];
        for (int i = 0; i < rows; i++) {//loop for rows
            for (int j = 0; j < colums; j++) {//loop for columns
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return sum;
    }

}
