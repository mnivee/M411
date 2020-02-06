package com.company;

public class MatrixAnzeigen {

    int [][] matrix = {{4, 5, 6},
            {2, -9, -3}};
        for(int i =0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
}
