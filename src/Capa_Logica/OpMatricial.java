/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Logica;

public class OpMatricial {
    
    public static double[] Crammer (Matriz Base, double[] soluciones, double determinante) throws ArithmeticException
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
        
        System.out.println(matriz.toString());
        
        return matriz.determinante();
    }

}
