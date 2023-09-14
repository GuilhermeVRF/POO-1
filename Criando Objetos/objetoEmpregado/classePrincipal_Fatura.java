/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetoEmpregado;

import java.util.Scanner;
import java.util.Set;

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
        String nomeCompleto, sobrenome = "";
        Empregado E1 = new Empregado();
        Empregado E2 = new Empregado();
        
        System.out.println("--Sistema de empregados--");
        
        System.out.print("Informe o CPF do empregado: ");
        E1.setCPF(Teclado.nextLine());
           
        System.out.print("Informe o nome completo do empregado: ");
        nomeCompleto = Teclado.nextLine();
        
        String[] nomeCompleto_quebrado = nomeCompleto.split(" ");
        for(int pos_quebrado = 1; pos_quebrado < nomeCompleto_quebrado.length; pos_quebrado++){
            sobrenome += nomeCompleto_quebrado[pos_quebrado] + " ";         
        }     
        E1.setNomeCompleto(nomeCompleto_quebrado[0], sobrenome);
        
        System.out.print("Informe o salário mensal de "+ E1.nome + ": R$");
        E1.setSalarioMensal(Teclado.nextDouble());
        
        System.out.println(E1.getDadosEmpregado());
        
        System.out.print("Informe a % do reajuste salarial: ");
        E1.reajusteSalarioMensal(Teclado.nextDouble());
        System.out.print("Salário reajustado com sucesso:  R$" + E1.salarioMensal);
    }
    
}
