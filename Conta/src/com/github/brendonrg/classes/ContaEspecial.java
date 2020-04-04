package com.github.brendonrg.classes;

public class ContaEspecial extends Conta {

    public void emprestar() {
        if (super.getSaldo() != 0) {
            System.out.println("Essa conta permite emprestar dinheiro");
        }

        }
        public void juros{
        if(emprestar() == 1){
            (super.getSaldo() * 10)/100;
        }
    }
    }