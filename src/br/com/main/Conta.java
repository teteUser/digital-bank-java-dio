package br.com.main;


/**
 *
 * @author teteUser
 */
public abstract class Conta implements InterfaceConta {
    private int agencia;
    private int numero;
    private double saldo;
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Override
    public void sacar(double valor) {
        if(valor > this.getSaldo()){
            System.out.println("Não é possível sacar essa quantia. Saldo insuficiente!\n\n");
        }else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("Você sacou R$%.2f. Seu novo saldo é R$%.2f.\n\n", valor, this.getSaldo());
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.printf("Você depositou R$%.2f. Seu novo saldo é R$%.2f.\n\n", valor, this.getSaldo());
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public Conta() {
        this.saldo = 0;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
              
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
    
    protected void imprimirInfosComuns() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo + "\n");
    }
   
    
    
}
