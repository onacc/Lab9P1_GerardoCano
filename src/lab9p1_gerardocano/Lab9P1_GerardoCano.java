/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_gerardocano;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Lab9P1_GerardoCano {

    static Scanner read = new Scanner(System.in);
    static Random ram = new Random();
    static Game g = new Game();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = new int[10][10];
        
        int op = 0;
        op = menu(op);
        do {
            switch (op) {
                case 1:
                   
                    System.out.println("Ingrese numero de rondas que quiere jugar ");
                    int a = read.nextInt();
                    ArrayList<String> coordinates = new ArrayList<>();
                    int temp[][] = new int[10][10];
                    int[][]next = new int[10][10];
                    temp=matram(temp,next,coordinates);
                    g.setCoordinates(coordinates);
                    g.setTemp(temp);
                    g.setNext(next);
                    g.jugar(a);
                    break;
                case 2:
                    System.out.println("Saliendo");
                    break;
            }

            op = menu(op);
        } while (op != 2);
    }

    public static int menu(int op) {

        System.out.println("Menu");
        System.out.println("1.Game of Life");
        System.out.println("2.Salir");
        System.out.println("Ingrese una opcion");
        op = read.nextInt();
        int opcion = op;
        return opcion;
    }

    public static int[][] matram(int[][]temp,int[][]next,ArrayList<String>coordinates) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j == 0 || i == 0 || i == temp.length - 1 || j == temp[0].length - 1) {
                    temp[i][j] = 0;
                } else {
                    temp[i][j] = 0 + ram.nextInt(2);
                }
                if (temp[i][j] == 1) {
                    coordinates.add(i + ":" + j);
                }

            }
        }

        return temp;
    }
    
}
