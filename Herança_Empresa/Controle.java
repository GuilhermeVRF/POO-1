/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Controle {
    
    protected static double totalBonificacao = 0;
    
    public static void calculaBonus(Funcionario F1){
        if(F1 instanceof Gerente){
            System.out.println("É um gerente!");
            totalBonificacao += F1.bonificacaoSalarial();
        }else if(F1 instanceof Funcionario){
            System.out.println("É um funcionario");
            totalBonificacao += F1.bonificacaoSalarial();
        }
    }
}
