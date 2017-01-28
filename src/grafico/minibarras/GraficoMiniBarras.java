/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.minibarras;

/**
 *
 * @author carlosjoseanguiano
 */
public class GraficoMiniBarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Se declara el tamaño del arreglo
        int[] arreglo = {0, 0, 0, 0, 0, 10, 1, 2, 4, 2, 1};
        //Se imprime el titulo
        System.out.println("Distribucion de calificaciones");
        //Se recorre el arreglo, ciclo for
        for (int i = 0; i < arreglo.length; i++) {
            //Si el valor que esta en el arreglo, y es igual a 10
            if (i == 10) {
                //Se imprime el valor
                System.out.printf("%5d:", 100);
            } else {
                //Se imprimi el valor siempre y cuando el valor no sea igual a 10
                System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
            }
            //Se recorre nuevamente el arreglo para asignar las estrellas(*)
            for (int estrellas = 0; estrellas < arreglo[i]; estrellas++) {
                System.out.print("*");
            }
            //Se imprime una nueva linea
            System.out.println();
        }
    }

}
