/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objeto_televisao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class classePrincipal_Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisao TV = new Televisao();
        Scanner Teclado = new Scanner(System.in);
        int opcaoMenu;
        
        System.out.println("---Menu TV---\n1. Ligar\n2. Desligar\n3. Aumentar volume\n4. Diminuir Volume\n5. Aumentar Canal\n6. Diminuir Canal\n7. Status da TV");
    
        do{
            System.out.print("Ação: ");
            opcaoMenu = Teclado.nextInt();
            
            switch(opcaoMenu){
                case 1:
                    System.out.println("Televisão ligada : " + TV.ligarTelevisao());
                break;
                
                case 2:
                    System.out.println("Televisão desligada: "+ TV.ligarTelevisao());
                break; 
                
                case 3:
                    System.out.println(TV.aumentarVolume());
                break;
                
                case 4:
                    System.out.println(TV.diminuirVolume());
                break;
                
                case 5:
                    System.out.println(TV.aumentarCanal());
                break;
                
                case 6:
                    System.out.println(TV.diminuirCanal());
                break;
                case 7:
                    TV.statusTV();
                break;    
            }
            
        }while(opcaoMenu != 2);
    }
    
}
