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
        do{
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
                Scanner num = new Scanner(System.in);
                int num1 =0;
                int num2=0;
                System.out.println("Ingrese numero 1: ");
                num1 = num.nextInt();
                System.out.println("Ingrese numero 2: ");
                num2 = num.nextInt();
                if(num1>num2){
                    System.out.println(num1+" es mayor");
                }else{
                    System.out.println(num2+" es mayor");
                }
                break;
            case 2: //problema 2
                Scanner numi = new Scanner (System.in);
                System.out.println("Ingresa numero: ");
                int numm = numi.nextInt();
                if (numm%2 == 1){
                    char matriz[][] = new char[numm][numm];
                    for(int x=0;x<matriz.length;x++){
                        for(int y=0; y<matriz[0].length;y++){
                            if((y+x)>=numm/2 && (y-x)<=numm/2 && (x%2)==1){
                                matriz[x][y]='*';
                            }else{
                                matriz[x][y]=' ';
                            }
                            System.out.print(" "+matriz[x][y]+" ");
                        }
                        System.out.println(" ");
                    }
                                              
                }else{
                    System.out.println("EL NUMERO INGRESADO DEBE SER UN NUMERO IMPAR");
                }
                System.out.println("Problema 2");
                break;
            case 3: //problema 3
                System.out.println("Problema 3");
                break;
                default: //numero mayor a 3
                System.out.println("Opcion no disponible");
            }     
        }while(opc!=4);

    }
    
}
