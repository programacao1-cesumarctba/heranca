package com.github.brendonrg.classes;

public class ContaSalario extends Conta {
    public void emprestar() {
        System.out.println("Essa conta não permite emprestimo");
    }
    public void depositar() {
        if(super.depositar() <= 2){
            System.out.println("limite de deposito excedido");
        }
    }
}
