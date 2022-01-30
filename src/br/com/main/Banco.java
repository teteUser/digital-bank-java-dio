package br.com.main;

import java.util.*;

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
        boolean rep = false;
        Iterator<Set> it = bancos.iterator();
        while(it.hasNext()){
            Set<Banco> b = new HashSet<>();
            b = it.next();
        }
        this.bancos.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
