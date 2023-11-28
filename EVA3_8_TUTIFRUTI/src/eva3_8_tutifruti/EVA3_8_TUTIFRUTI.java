/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_tutifruti;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_TUTIFRUTI {
    final static String USUARIO = "TUTTI";
    final static String PASSWORD = "FRUTTI";
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String usu;
        String pwd;
        do{
            
            usu = capturaDatos("USUARIO: ");
            pwd = capturaDatos("CONTRASEÑA: ");
 
        }while(!validarUsuario(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA!!");
    
    }
    public static boolean validarUsuario(String usuario, String pwd){
    
        if(usuario.equals(USUARIO) && pwd.equals(PASSWORD))
            return true;
        else
            return false;
    }
    
    public static String capturaDatos(String mensaje) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        return sc.nextLine();
        
    }
        
    }

