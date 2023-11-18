/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herança_Cinema;

/**
 *
 * @author guilh
 */
public class classePrincipal_Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingresso I1 = new Ingresso(20);
        VIP V1 = new VIP(20,5);
        Normal N1 = new Normal(20);
        CamaroteSuperior CS1 = new CamaroteSuperior(20,10,1,10);
        CamaroteInferior CI1 = new CamaroteInferior(20,10,3);
        System.out.println(CS1.toString());
    }
}
    
