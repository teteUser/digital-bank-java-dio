package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente implements Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private String tipo;

    @Override
    public void sacar() {
        
    }

    @Override
    public void depositar() {
        
    }

    @Override
    public void transferir() {
        
    }

    public ContaCorrente() {
        this.tipo = "CC";
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + '}';
    }

    
}
