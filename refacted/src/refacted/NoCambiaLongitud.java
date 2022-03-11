/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package refacted;

public class NoCambiaLongitud {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
     private int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

  

    public void Visualizar( final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    public void modificar(int[] vector, int posicion, CambiaLongitud cambiaLongitud) {
        int i;
        int LongituActual = 0;
        //Mostramos los elementos del array
        System.out.print("vector={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        //Mostramos los elementos del array
        cambiaLongitud.Visualizar(longitud, vector);
    }
    
    
    
    


}
    
