/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.objeto_contaBancaria;

/**
 *
 * @author guilh
 */
public class Cliente {
    private int ID;
    private String senha;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    
   public Cliente(int ID){
        this.ID = ID;
        this.nome = null;
        this.CPF = null;
        this.endereco = null;
        this.telefone = null;
   }
    
    public Cliente(int ID, String senha, String nome, String CPF, String endereco, String telefone){
        this.ID = ID;
        this.senha = senha;
        this.nome = nome;
        this.setCPF(CPF);
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }  
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        if(CPF.length() == 11){
            this.CPF = CPF.substring(0, 3)+ "." + CPF.substring(3, 6) + "."+ CPF.substring(6, 9) + "-" + CPF.substring(9, 11);
        }else{
            this.CPF = "000.000.000-00";
        }
        
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        if(telefone.length() == 11){
            this.telefone = telefone;
        }
        
    }
    public int getID(){
        return this.ID;
    }
    public String getSenha(){
        return this.senha;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.CPF;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String toString(){
        return "ID: "+ this.ID + "\nNome: "+ this.nome + "\nSenha: *"+ "\nCPF: "+ this.CPF+ "\nEndereço: "+ this.endereco + "\nTelefone: "+ this.telefone;
    }
}
