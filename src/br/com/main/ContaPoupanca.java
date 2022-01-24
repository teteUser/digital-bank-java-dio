package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaPoupanca implements Conta{
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

    public ContaPoupanca() {
        this.tipo = "CP";
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
        return "ContaPoupanca{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
}
