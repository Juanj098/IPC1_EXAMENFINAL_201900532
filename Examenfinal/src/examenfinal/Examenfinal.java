/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.*;
/**
 *
 * @author juanj
 */
public class Examenfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menu
        Scanner opcion = new Scanner(System.in);
        int opc = 0;
        System.out.println("--------------------");
        System.out.println("    EXAMEN FINAL    ");
        System.out.println("--------------------");
        System.out.println("1.  Problema no.1   ");
        System.out.println("2.  Problema no.2   ");
        System.out.println("3.  Problema no.3   ");
        System.out.println("--------------------");
        System.out.println("Ingrese no. de problema: ");
        opc = opcion.nextInt();
        switch(opc){
            case 1: //problema 1
                System.out.println("Problema 1");
            break;
            case 2: //problema 2
                System.out.println("Problema 2");
            break;
            case 3: //problema 3
                System.out.println("Problema 3");
            break;
            default: //numero mayor a 3
            System.out.println("Opcion no disponible");
        }
    }
    
}
