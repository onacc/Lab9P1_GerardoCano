/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_gerardocano;

import java.util.ArrayList;
import static lab9p1_gerardocano.Lab9P1_GerardoCano.ram;

/**
 *
 * @author gcano
 */
public class Matriz {
    private int [][] matriz;

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public String print(int[][] matrix) {
        String str = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                str += "[" + matrix[i][j] + "]" + " ";
            }
            str += "\n";
        }

        return str;
    }
    
}
