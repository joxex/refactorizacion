/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package refacted;

/**
 *
 * @author diurno
 */
public class Refacted {

static void main(String[] args) {
// TODO code application logic here
int []vector= new int[5];
vector[0]=2;
vector[1]=4;
vector[2]=6;
vector[3]=8;
Prueba posicion=new Prueba();
posicion.setValor(10);
posicion.modificar(vector, 1);
posicion.borrar(vector);
posicion.insertar(vector);
}

}
