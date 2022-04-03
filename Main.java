/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopilasedd;

/**
 *
 * @author Juan JuanPerez y JuanPasch
 */

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        System.out.println ("Por favor introduzca la expresion en notacion infija: ");
        Scanner entradaEscaner = new Scanner (System.in);
        String infija = entradaEscaner.nextLine ();
        
        InfijaaPosfija clase = new InfijaaPosfija();
        clase.evaluar(infija);
    }
}
//Comentarios creados con el fin de explicar un poco el codigo a "Prof lenin Javier"
// :)