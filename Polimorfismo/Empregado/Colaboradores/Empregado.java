/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado.Colaboradores;

/**
 *
 * @author guilh
 */
public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    //Método abstrato, as sub-classes são obrigadas a codificarem.
    public abstract double vencimentos();
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(this.getClass() != o.getClass()){
            return false;
        }else{
            Empregado empregado = (Empregado) o;
            return empregado.cpf.equals(empregado.cpf);
        }
    }
    
    @Override
    public int hashCode(){
        return this.cpf.hashCode();
    }
    
    @Override
    public String toString(){
        return "Nome: "+ this.nome +
                "\nSobrenome: "+ this.sobrenome +
                "\nCPF: "+ this.cpf;
    }
}
