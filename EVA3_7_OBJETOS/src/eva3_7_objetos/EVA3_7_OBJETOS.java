/*
CLASES Y OBJETOS
UNA PLANTILLA SIRVE PARA CREAR MULTIPLES OBJETOS SEMEJANTES
COMO TAL LA PLANTILLA NO EXISTE
UNA CLASE ES UNA PLANTILLA --> CREAR OBJETOS
SON CODIGO QUE NO FUNCIONA
 */
package eva3_7_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1);
        
        perso1.nombre = "JUAN";
        perso1.apellido = "PEREZ";
        perso1.edad = 10;
        imprimirPersonas(perso1);

        Persona perso2 = new Persona();
        System.out.println(perso2);
        
        perso2.nombre = "PEDRO";
        perso2.apellido = "PÁRAMO";
        perso2.edad = 70;
        imprimirPersonas(perso2);
    }
    
    public static void imprimirPersonas(Persona perso){
    
        System.out.println("Dirección: "+perso);
        System.out.println("Nombre completo: "+perso.nombre+" "+perso.apellido );
        System.out.println("Edad "+perso.edad);
    }
    
    
}
/*DEFINEN UNA PLANTILLA PARA CREAR OBJETOS
CREAN UN NUEVO TIPO DE DATO*/
    class Persona {
    
        String nombre, apellido;
        int edad;
    
    }
