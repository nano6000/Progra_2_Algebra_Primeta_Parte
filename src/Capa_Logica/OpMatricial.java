/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Logica;

public class OpMatricial {
    
    public static double[] Crammer (Matriz Base, double[] soluciones, double determinante) 
    {
        double[] respuesta = new double[soluciones.length];

        for (int i = 0; i < soluciones.length; i++)
        {
            respuesta[i] = determinanteVariable(Base, soluciones, i) / determinante;
        }

        return respuesta;
    }
    

    private static double determinanteVariable(Matriz Base, double[] soluciones, int colum) 
    {
        Matriz matriz = Base.clone(); 
        for (int i = 0; i < soluciones.length; i++) 
        {
            matriz.insertElem(colum, i, soluciones[i]);
        }
        
        //System.out.println(matriz.toString());
        
        return matriz.determinante();
    }
    
    public static double[] multiplicarMatriz(Matriz matriz, double[] vector)
    {
        double[] resultado = new double[3];
        double[] temp;
        for (int i = 0; i < matriz.getSize(); i++) 
        {
            resultado[i] = multiplicar_Aux(0, 0, i, vector, matriz);
            System.out.println(resultado[i] + "___" + i);
        }
        return resultado;
    }
    /**
     * 
     * @param vf, fila del vector
     * @param vc, columna del vector
     * @param mc, columna de la matriz
     * @param mf, fila de la matriz
     * @param vector, vector
     * @param matriz, matriz
     * @return 
     */
    private static double multiplicar_Aux(int vc, int mc, int mf, double[] vector, Matriz matriz)
    {
        double result = 0;
        if (vector.length>vc && matriz.getFila(0).length>mc && matriz.getSize()>mf)
        {
            result = multiplicar_Aux(vc+1, mc+1, mf, vector, matriz)
                    + (double) vector[vc] * (double) matriz.getElement(mf, mc);
            
        System.out.println( vector[vc] + " " + matriz.getElement(mf, mc));
        }
        return result;
    }

}
