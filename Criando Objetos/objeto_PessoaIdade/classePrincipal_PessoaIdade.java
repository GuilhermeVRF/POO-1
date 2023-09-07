/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objeto_PessoaIdade;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class classePrincipal_PessoaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        PessoaIdade Pessoa = new PessoaIdade();
        String dataNasc;
        int[] dataInteiro = new int[3];
        
        System.out.print("Informe seu nome: ");
        Pessoa.nomePessoa = Teclado.next();
        
        System.out.print("Informe a sua data de Nascimento: (dd/mm/aaaa)");
        dataNasc = Teclado.next();
        
        
        String[] split = dataNasc.split("/");
        for(int posicaoAtual = 0; posicaoAtual < split.length; posicaoAtual++){
            dataInteiro[posicaoAtual] = Integer.parseInt(split[posicaoAtual]);
        }
        
        Pessoa.ajustaDataDeNascimento(dataInteiro[0], dataInteiro[1], dataInteiro[2]);
        Pessoa.calculaIdade();
        Pessoa.informaIdade();
    }
    
}
