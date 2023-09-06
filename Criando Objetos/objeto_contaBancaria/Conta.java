/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto_contaBancaria;

/**
 *
 * @author guilh
 */
public class Conta {

    int numeroID;
    String titular;
    double saldo;

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
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
        //boolean transferencia = false;
        //if(this.saldo >= valorTransferencia){
        C.depositarValor(valorTransferencia);
        this.sacarValor(valorTransferencia);
        //transferencia = true;
        //}
        //return transferencia;
    }
}
