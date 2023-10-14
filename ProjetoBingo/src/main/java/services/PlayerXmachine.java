package services;

import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class PlayerXmachine {
    static Random random = new Random(10);

    private final Set<Integer> numerosSorteados = new TreeSet<>();
    private final Set<Integer> tabelaJogador = new TreeSet<>();
    private final Set<Integer> tabelaMaquina = new TreeSet<>();

    // NUMEROS GERADOS AUTOMATICAMENTE
    int numerosDaSorte() {
        return random.nextInt(1, 30);
    }

    // TABELA DO JOGADOR
    public Set<Integer> tabelaJogador() {

        System.out.println();
        System.out.println("TABELA DO JOGADOR: ");
        for (int i = 1; i < 11; i++) {
            tabelaJogador.add(numerosDaSorte());
        }
        while (tabelaJogador.size() < 10){
            tabelaJogador.add(numerosDaSorte());
        }
        System.out.print(tabelaJogador);
        return tabelaJogador;
    }

    // TABELA MAQUINA
    public Set<Integer> tabelaMaquina() {

        System.out.println();
        System.out.println("TABELA DO MAQUINA: ");
        for (int i = 1; i < 11; i++) {
            tabelaMaquina.add(numerosDaSorte());
        }
        while (tabelaMaquina.size() < 10){
            tabelaMaquina.add(numerosDaSorte());
        }
        System.out.print(tabelaMaquina);
        return tabelaMaquina;
    }

    // TABELA DE NUMEROS SORTEADOS
    public Set<Integer> numerosSorteados() {

        System.out.println();
        System.out.println("NUMEROS SORTEADOS: ");
        for (int i = 1; i < 11; i++) {
            numerosSorteados.add(numerosDaSorte());
        }
        while (numerosSorteados.size() < 10){
            numerosSorteados.add(numerosDaSorte());
        }
        System.out.println(numerosSorteados);
        return numerosSorteados;
    }

    // EQUALS AND HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerXmachine that)) return false;
        return Objects.equals(numerosSorteados, that.numerosSorteados) && Objects.equals(tabelaJogador, that.tabelaJogador) && Objects.equals(tabelaMaquina, that.tabelaMaquina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerosSorteados, tabelaJogador, tabelaMaquina);
    }

    public void ganhador() {
        System.out.println();
        if (tabelaMaquina.equals(numerosSorteados)){
            System.out.println("Maquina Ganhou");
        } else if (tabelaJogador.equals(numerosSorteados)){
            System.out.println("Jogador Ganhou");
        } else {
            System.out.println("Não teve Ganhador");
        }
    }



}
