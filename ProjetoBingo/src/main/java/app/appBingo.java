package app;

import services.PlayerXmachine;


public class appBingo {
    public static void main(String[] args) {
        PlayerXmachine playerXmachine = new PlayerXmachine();

        playerXmachine.numerosSorteados();

        playerXmachine.tabelaJogador();
        System.out.println();
        playerXmachine.tabelaMaquina();
        System.out.println();
        playerXmachine.ganhador();

    }
}
