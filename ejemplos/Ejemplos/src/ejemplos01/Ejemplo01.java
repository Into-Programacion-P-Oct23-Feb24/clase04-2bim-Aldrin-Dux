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

    public static String obtenerNombre() {
        return "Luis";
    }

}
