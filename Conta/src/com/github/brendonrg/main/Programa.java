package com.github.brendonrg.main;

import com.github.brendonrg.classes.Conta;
import com.github.brendonrg.classes.ContaEspecial;

public class Programa {
        public static void main(String[] args){
            try {
                Conta conta = new Conta();
                conta.setTitular("Joao da Silva");
                conta.setNumero("12346");
                conta.depositar(100d);
                conta.depositar(100d);
                System.out.println(String.format("Titular da conta: %s \n" +
                        "Numero da conta: %s \n" +
                        "Saldo da conta %f \n", conta.getTitular(), conta.getNumero(), conta.getSaldo()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
