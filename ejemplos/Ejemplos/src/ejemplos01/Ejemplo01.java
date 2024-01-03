/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);*/
        obtenerMultiplicacion(7,50);
        
        String miMensaje=obtenerMultiplicacionDos(7,50);
        System.out.printf("%s\n",miMensaje);
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }
    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        int operacion;
        String cadena="";
        for (int i = 0; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }
    /*
    En este caso la funcion esta siendo invocada y no usada directamente por ende
    se debe quitar el "void" que estaba antes para permitir que la funcion retorne
    lo que queremos, y poner String para que nos retorne el dato en cadena que es
    lo que se pide en el principal
    */

    public static void obtenerMultiplicacion(int tabla, int limite) {
        int operacion;
        String cadena="";
        for (int i = 0; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        System.out.printf("%s\n",cadena);
    }
    /*
    Caso contrario aqui esta no esta siendo invocada y solo es usadad directamente
    asi que solo se debe enviar el valor que tiene sin retornar que de todos modos 
no serviria debido a que tiene el "void"
    */

    public static String obtenerNombre() {
        return "Luis";
    }

}
