
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void collatzBerechnung(long n){
       while (n > 0){
            if( n % 2 == 0){
                System.out.print((n/2) + " ");
                n = n/2;
            } else {
                System.out.print((3*n+1)+"");
                n = 3 * n + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String eingabe;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Eingabe: ");
        eingabe = input.readLine();
        Long n = Long.parseLong(eingabe);
        System.out.println("Collatz-Berechnung für: " + eingabe);
        collatzBerechnung(n);

        // Matrix anzeigen und auslesen

        int [][] matrix = {{4, 5, 6},
                {2, -9, -3}};
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
