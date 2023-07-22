package com.githubapolomoraes.banco.app;

import com.githubapolomoraes.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da Silva", "14566216809");
        Pessoa pessoa2 = new Pessoa("Armando de Souza", "14566216756");


        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

//        System.out.println(pessoas);

//        Pessoa pessoa3 = pessoas.get(1);
//        System.out.println(pessoa3);


//        for(int i = 0; i < pessoas.size(); i++) {
//            System.out.println(pessoas.get(i).getNome());
//        }

//        for (Pessoa pessoa : pessoas) {
//            System.out.println(pessoa.getNome());
//        }

        Pessoa pessoa4 = new Pessoa("João da Silva", "14566216809");

//        boolean existe = pessoas.contains(pessoa4);
//        System.out.println(existe);

        System.out.println(pessoa1.equals(pessoa4));
    }
}
