/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.objeto_contaBancaria;

/**
 *
 * @author guilh
 */
public class Conta {

    private int numeroID;
    private String senha;
    private Cliente titular;
    private double saldo;

    public Conta(int numeroID, String senha, Cliente titular){
        this.numeroID = numeroID;
        this.senha = senha;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }
    public String getSenha(){
        return this.senha;
    }
    public int getNumeroID(){
        return this.numeroID;
    }
        
    public Cliente getTitular(){
        return this.titular;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }
    public void setCliente(Cliente C){
        this.titular = C;
    }

    public boolean sacarValor(double valorSaque) {
        boolean sacar = false;
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            sacar = true;
        }
        return sacar;
    }

    public void depositarValor(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void transferirValor(Conta C, double valorTransferencia) {
            C.depositarValor(valorTransferencia);
            this.sacarValor(valorTransferencia);        
    }
    public String toString(){
        return "ID: "+ this.numeroID + "\n-Titular-\n"+ this.titular.toString() +"\n------\nSaldo: R$"+ this.saldo;
    }
}