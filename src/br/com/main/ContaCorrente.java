package br.com.main;

/**
 *
 * @author teteUser
 */
public class ContaCorrente extends Conta{
    private String tipo;
    
    public ContaCorrente() {
        this.tipo = "CC";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Corrente =====");
        super.imprimirInfosComuns();
    }

}
