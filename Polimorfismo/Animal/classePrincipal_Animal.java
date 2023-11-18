/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo.Animal;

/**
 *
 * @author guilh
 */
public class classePrincipal_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal A1 = new Cachorro("Theo", 2);
        System.out.println("Cachorro: ");
        A1.locomover();
        A1.emitirSom();

        Animal A2 = new Cavalo("Pé de pano", 7);
        System.out.println("Cavalo: ");
        A2.locomover();
        A2.emitirSom();
        
        Animal A3 = new Preguiça("Rimão",8);
        System.out.println("Preguiça: ");
        A3.locomover();
        A3.emitirSom();;
    } 
}
