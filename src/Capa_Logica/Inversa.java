package Capa_Logica;


import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Inversa{

    public static double[][] matrizInversa(double[][] matriz) {

        double det = 1 / determinante(matriz);

        double[][] nmatriz = matrizAdjunta(matriz);

        multiplicarMatriz(det, nmatriz);
        
        return nmatriz;
    }

    public static void multiplicarMatriz(double n, double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] *= n;
                //System.out.println(matriz[i][j]);
            }
        }
    }

    public static double[][] matrizAdjunta(double[][] matriz) {
        if (matriz.length==2)
        {
            return matrizTranspuesta(matrizCofactores2(matriz));
        }
        return matrizTranspuesta(matrizCofactores(matriz));
    }
    
    public static double[][] matrizCofactores2(double[][] matriz) {
        double[][] nm = new double[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                double[][] det = new double[matriz.length - 1][matriz.length - 1];
                double detValor;
                for (int k = 0; k < matriz.length; k++) {
                    if (k != i) {
                        for (int l = 0; l < matriz.length; l++) {
                            if (l != j) {
                                int indice1 = k < i ? k : k - 1;
                                int indice2 = l < j ? l : l - 1;
                                det[indice1][indice2] = matriz[k][l];
                                //System.out.println(det[indice1][indice2]);
                                nm[i][j] = det[indice1][indice2] * (double) Math.pow(-1, i + j);
                            }
                        }
                    }
                }
                detValor = determinante(det);
                //System.out.println(detValor);
                //nm[i][j] = detValor * (double) Math.pow(-1, i + j);
                //System.out.println(nm[i][j]);
            }

        }
        return nm;
    }
    
    public static double[][] matrizCofactores(double[][] matriz) {
        double[][] nm = new double[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                double[][] det = new double[matriz.length - 1][matriz.length - 1];
                double detValor;
                for (int k = 0; k < matriz.length; k++) {
                    if (k != i) {
                        for (int l = 0; l < matriz.length; l++) {
                            if (l != j) {
                                int indice1 = k < i ? k : k - 1;
                                int indice2 = l < j ? l : l - 1;

                                det[indice1][indice2] = matriz[k][l];
                                //System.out.println(det[indice1][indice2]);
                            }
                        }
                    }
                }
                detValor = determinante(det);

                nm[i][j] = detValor * (double) Math.pow(-1, i + j + 2);

            }

        }

        return nm;
    }

    public static double[][] matrizTranspuesta(double[][] matriz) {
        double[][] nuevam = new double[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                nuevam[i][j] = matriz[j][i];
            }
        }
        return nuevam;

    }

    public static double determinante(double[][] matriz) {
        double det;
        if (matriz.length == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
            return det;
        }
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            double[][] nm = new double[matriz.length - 1][matriz.length - 1];

            for (int j = 0; j < matriz.length; j++) {
                if (j != i) {
                    for (int k = 1; k < matriz.length; k++) {
                        int indice = -1;
                        if (j < i) {
                            indice = j;
                        } else if (j > i) {
                            indice = j - 1;
                        }
                        nm[indice][k - 1] = matriz[j][k];

                    }
                }

            }
            if (i % 2 == 0) {
                suma += matriz[i][0] * determinante(nm);
            } else {
                suma -= matriz[i][0] * determinante(nm);
            }
        }
        //System.out.println(suma);
        return suma;
    }

}
