/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objeto_Fatura;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class classePrincipal_Fatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Fatura gasto = new Fatura();
        
        System.out.print("Informe o ID do produto: ");
        gasto.setNumeroID(Teclado.next());
        
        System.out.print("Informe uma descrição para o produto: ");
        gasto.setDescProduto(Teclado.next());
        
        System.out.print("Informe a quantidade comprada desse produto: ");
        gasto.setQtdeProduto(Teclado.nextInt());
        
        System.out.print("Informe o preço unitário desse produto: R$");
        gasto.setPrecoProduto(Teclado.nextDouble());
        
        System.out.println("----Fatura----");
        System.out.println("ID: "+ gasto.getNumeroID());
        System.out.println("Descrição: "+ gasto.getDescProduto());
        System.out.println("Quantidade do produto: "+ gasto.getQtdeProduto());
        System.out.println("Valor unitário: R$"+ gasto.getPrecoProduto());
        System.out.println("Gasto total: R$"+gasto.getTotalFatura());
    }
    
}
