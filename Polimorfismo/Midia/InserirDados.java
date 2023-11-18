/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Midia;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class InserirDados {
    private static int codigoAtual_DVD = 0;
    private static int codigoAtual_CD = 0;
    private static Scanner Teclado = new Scanner(System.in);
    
    public static Midia criarMidia(Midia midia){
        System.out.println("Cadastro de "+ midia.getTipo());
        
        System.out.print("Nome: ");
        String nome = Teclado.next();
        
        Teclado.next();
        System.out.print("Pre�o: ");
        double preco = Teclado.nextDouble();
        
        if(midia instanceof DVD){
            System.out.print("N�mero de faixas: ");
            int numeroFaixas = Teclado.nextInt();
            
            return (DVD) new DVD(codigoAtual_DVD++, nome, preco, numeroFaixas);
        }else{
            System.out.print("N�mero de m�sicas: ");
            int numeroMusicas = Teclado.nextInt();
            
            return new CD(codigoAtual_CD++, nome, preco, numeroMusicas);
        }
    }
}
