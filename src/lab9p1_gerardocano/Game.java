/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_gerardocano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Game {
    ArrayList<String> coordinates;
    int [][] temp;
    int [][] next;
    int round;

    public Game() {
        
    }

    public ArrayList<String> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<String> coordinates) {
        this.coordinates = coordinates;
    }

    public int[][] getTemp() {
        return temp;
    }

    public void setTemp(int[][] temp) {
        this.temp = temp;
    }

    public int[][] getNext() {
        return next;
    }

    public void setNext(int[][] next) {
        this.next = next;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
   public int jugar(int x){
        round=1;
        for (int i = 0; i < x; i++) {
            System.out.println("Ronda: " + round);
            //System.out.println(print(coordinates));
            nextGen();
            round++;
            setCoordinates(Coordenadas(temp));
            printCoordenadas(coordinates);
        }
        return round;
    }

    public String print(ArrayList<String>coordinates){
        String str="";
        //int [][] temp = new int [10][10];
        //
        for (int i = 0; i < coordinates.size(); i++) {
            String[]array = coordinates.get(i).split(":");
            temp[Integer.parseInt(array[0])][Integer.parseInt(array[1])]=1;
        }
        for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 9; j++) {
                str+='['+temp[i][j]+']';
            }
            str += "\n";
        }
        return str;
    }
    public void nextGen(){
         for (int i = 1; i < 9; i++)
        {
            for (int k = 1; k < 9; k++)
            {
                int vecinosV = 0;
                for (int l = 1; l <= 8; l++){
                    if (l == 1){
                        if (temp[i + 1][k] == 1)
                            vecinosV++;
                    }else if(l == 2){
                        if (temp[i - 1][k] == 1)
                            vecinosV++;
                    }else if (l == 3){
                        if (temp[i][k+1] == 1)
                            vecinosV++;
                    }else if (l == 4){
                        if (temp[i][k-1] == 1)
                            vecinosV++;
                    }
                    else if (l == 5){
                        if (temp[i - 1][k-1] == 1)
                            vecinosV++;
                    }
                    else if (l == 6){
                        if (temp[i + 1][k-1] == 1)
                            vecinosV++;
                    }
                    else if (l == 7){
                        if (temp[i - 1][k+1] == 1)
                            vecinosV++;
                    }
                    else if (l == 8){
                        if (temp[i + 1][k+1] == 1)
                            vecinosV++;
                    }
                }}}
                
 
        for (int g = 0; g < 10; g++) {
            for (int j = 0; j < 10; j++) {
                
                if(next[g][j]==1){
                    coordinates.add(g+":"+j);
                }
            }
        }
        /*int[][]temp1 = temp;
        temp=next;
        next=temp1;*/
    
        String matriz = print(coordinates);
        System.out.print(matriz);
        int[][]temp1 = temp;
        setTemp(next);
        print(coordinates);
    
}
    public  ArrayList<String> Coordenadas(int[][]temp){
        ArrayList<String> coordinates = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if (temp[i][j] == 1) {
                    coordinates.add(i + ":" + j);
                } 
            }
        }
        return coordinates;
    }
    public void printCoordenadas(ArrayList<String>coordinates){
        for (int i = 0; i < coordinates.size(); i++){
            System.out.print("("+coordinates.get(i)+");");
        }
        System.out.println();
    }
}
