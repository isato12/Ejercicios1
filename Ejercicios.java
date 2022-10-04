/**
 * Ejercicios
 * Primera parte:
 * 
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * 
 * Llamar a la función en el main y darle valores.
 * 
 * Segunda parte:
 * 
 * Crear una clase coche.
 * 
 * Dentro de la clase coche, una variable numérica que almacene el número de
 * puertas que tiene.
 * 
 * Una función que incremente el número de puertas que tiene el coche.
 * 
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * 
 * Mostrar el número de puertas que tiene el objeto.
 */
public class Ejercicios {

    public static void main(String[] args) {
        suma(50, 20, 36);

        Coche sedan = new Coche();
        sedan.aumentarPuertas();
        sedan.aumentarPuertas();
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }

    public class Coche {
        //variables
        int puertas = 2;

        //metodos
        public void aumentarPuertas(){
            this.puertas++;
            System.out.println("el numero de puertas es:" + puertas);
        }
    }

}