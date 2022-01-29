package br.com.main;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author teteUser
 */
public class Banco {
    private String nome;
    public Set<Conta> contas = new HashSet<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
