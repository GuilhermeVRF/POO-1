/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Midia;

/**
 *
 * @author guilh
 * @param <T>
 */
public abstract class Midia<T> implements Comparable<T>{
    private int codigo;
    private String nome;
    private double preco;
    
    public Midia(){
        this.codigo = 0;
        this.nome = null;
        this.preco = 0.0;
    }
    
    public Midia(String nome){
        this.codigo = 0;
        this.nome = nome;
        this.preco = 0.0;
    }
    
    public Midia(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    public String getTipo(){
        return this.getClass().getName();
    }
    
    public String getDetalhes(){
        return  "Código: "+ this.codigo +
                "\nNome: "+ this.nome +
                "\nPreço: R$"+ this.preco;
    }
    
    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Midia outraMidia = (Midia) obj;
        //O hash Code é chamado aqui.
        return (this.nome.hashCode() == outraMidia.hashCode());
    }
    
    @Override
    public abstract int compareTo(T outraMidia);
    
    @Override
    public String toString(){
        return  this.nome/*"Mídia: "+ this.getTipo() +
                "\n" + this.getDetalhes()*/;
    }
}
