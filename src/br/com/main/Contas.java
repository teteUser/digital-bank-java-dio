package br.com.main;

/**
 *
 * @author teteUser
 */
public abstract class Contas {
    private int agencia;
    private int numero;
    private double saldo;

    protected int getAgencia() {
        return agencia;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    protected int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Contas{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
   
    
    
}
