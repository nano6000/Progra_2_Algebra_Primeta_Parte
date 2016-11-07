/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica;

/**
 *
 * @author esteb
 */
public class Matriz {
    
    double[][] matriz;

    public Matriz(int i, int j) {
        this.matriz = new double[i][j];
    }
    
    public Matriz(int i) {
        this.matriz = new double[i][i];
    }
    
    /***
     * calcula el determinante de la matriz dada
     * @return 
     */
    public double determinante() {

        //System.out.println("inside determinante");
        //printMatriz(matriz);
        double determinante = 0.0;
        int n = matriz.length;
        if (n > 2) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    determinante += matriz[0][i] * determinanteAux(Cofactor(matriz, i, 0));
                    //System.out.print("+curr det:" + determinante +"\n");
                } else {
                    determinante -= matriz[0][i] * determinanteAux(Cofactor(matriz, i, 0));
                    //System.out.print("curr det:" + determinante +"\n");
                }
            }
        } else {
            //System.out.print("determinante = " + (matriz[0][0]*matriz[1][1] -(matriz[0][1]*matriz[1][0])) + "\n");
            System.out.println("len matriz: " + matriz.length + "\n");
            return (matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]));
        }
        return determinante;
    }
    
    private double determinanteAux(double[][] cofactor) {

        //System.out.println("inside determinante");
        //printMatriz(matriz);
        double determinante = 0.0;
        int n = cofactor.length;
        if (n > 2) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    determinante += cofactor[0][i] * determinanteAux(Cofactor(cofactor, i, 0));
                    //System.out.print("+curr det:" + determinante +"\n");
                } else {
                    determinante -= cofactor[0][i] * determinanteAux(Cofactor(cofactor, i, 0));
                    //System.out.print("curr det:" + determinante +"\n");
                }
            }
        } else {
            //System.out.print("determinante = " + (matriz[0][0]*matriz[1][1] -(matriz[0][1]*matriz[1][0])) + "\n");
            System.out.println("len matriz: " + matriz.length + "\n");
            return (matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]));
        }
        return determinante;
    }
    
    /***
     * Determina el cofactor de la matriz dada
     * @param matriz
     * @param i
     * @param j
     * @return 
     */
    private double[][] Cofactor(double[][] matriz, int i, int j) {
        //System.out.println("matriz["+j+"]["+i+"]: " +matriz[j][i]);
        int n = matriz.length;
        int X = 0;
        int Y = 0;
        double[][] subArr = new double[n - 1][n - 1];
        for (int ip = 0; ip < n; ip++) {
            if (ip == i) {
                ip++;
            }
            if (ip < n) {
                //System.out.println("ip = " + ip+"\n");
                for (int jp = 0; jp < n; jp++) {
                    if (jp == j) {
                        jp++;
                    }
                    if (jp < n) {
                        //System.out.println("jp = " + jp+"\n");
                        subArr[X][Y] = matriz[jp][ip];
                        X++;
                    }
                }
                X = 0;
                Y++;
            }
        }
        //System.out.println("subArr");   
        //printMatriz(subArr);
        return subArr;
    }
}
