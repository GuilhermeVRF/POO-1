/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class ClassePrincipal_Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente G = new Gerente("Wander","143",1900, "2");
        
        Controle.calculaBonus(G);
        System.out.println(Controle.totalBonificacao);
    }
    
}
