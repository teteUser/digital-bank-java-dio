package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaPoupanca extends Conta{
    private String tipo;

    public ContaPoupanca() {
        this.tipo = "CP";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Poupança =====");
        super.imprimirInfosComuns();
    }
    
}
