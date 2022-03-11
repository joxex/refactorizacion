/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refacted;

/**
 *
 * @author diurno
 */
public class Refacted {

static void main(String[] args) {
// TODO code application logic here
int []v= new int[5];
v[0]=2;
v[1]=4;
v[2]=6;
v[3]=8;
Prueba posicion=new Prueba();
posicion.valor=10;
posicion.modificar(v);
posicion.borrar(v);
posicion.in(v);
}

}
