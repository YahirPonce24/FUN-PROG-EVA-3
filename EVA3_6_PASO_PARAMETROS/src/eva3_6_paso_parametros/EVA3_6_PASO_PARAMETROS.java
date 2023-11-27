/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_paso_parametros;

/**
 *
 * @author invitado
 */
public class EVA3_6_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x = 5;
        System.out.println("El valor de x en el main() es de "+x);
        pasoPorValor(x);
        System.out.println("El valor de x en el main() despues de la llamada es de "+x);
    
    }
    
    public static void pasoPorValor (int valor){
            //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVÍA UNA COPIA AL MÉTODO
        System.out.println("El valor que recibo en el método es de "+valor);
        valor++;
        System.out.println("El valor modificado en el método es de "+valor);
    }
    
}
