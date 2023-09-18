/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto_contaBancaria;

/**
 *
 * @author guilh
 */
public class Cliente {
    private int ID;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    
    public void setID(int ID){
        this.ID = ID;
    }  
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public int getID(){
        return this.ID;
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
}
