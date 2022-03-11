/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package refacted;

public class CambiaLongitud extends NewClass {

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

    public void modificar(int[] vector, int posicion) {
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
vector[posicion] = this.getValor();
        }
    //Mostramos los elementos del array
        Visualizar( longitud, vector);
    }
    
    public void borrar(int[] vector) {
        int posicion = 1, i;
        int LongituActual = 0;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
         final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i < longitud - 1; i--) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        System.out.print("vector={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    public void insertar(int[] vector) {
        int LongituActual = 0;
        int posicion = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
         final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }
        Visualizar( longitud, vector);
    }

    
    
    
    


}
    
