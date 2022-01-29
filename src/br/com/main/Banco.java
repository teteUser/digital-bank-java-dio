package br.com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author teteUser
 */
public class Banco {
    private String nome;
    public List<Conta> contas = new ArrayList<>();
    public Set<Banco> bancos = new HashSet<>();

    public Banco(String nome) {
        this.nome = nome;
        this.bancos.add(this);
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
