/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetoEmpregado;

/**
 *
 * @author guilh
 */
public class Empregado {
    String nome, sobrenome, CPF;
    double salarioMensal;
    
    void setCPF(String CPF){
        this.CPF = CPF;
    }  
    void setNomeCompleto(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    String getDadosEmpregado(){
        return "CPF: "+ this.CPF+ "\nNome: "+ this.nome + "\nSobrenome: "+ this.sobrenome + "\nSalário mensal atual: "+ this.salarioMensal;               
    }
    void reajusteSalarioMensal(double percentReajuste){
        this.salarioMensal += (this.salarioMensal * (percentReajuste/100));
    }
}
