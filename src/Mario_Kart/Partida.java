package Mario_Kart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partida {

    private final List<Jogador> jogadores = new ArrayList<>();

    public Partida(int numJogadores, List<String> nomes) throws IOException {
        MKComponentes mkComponentes = new MKComponentes();
        Collections.shuffle(mkComponentes.getPersonagens());

        for(int i = 0; i < numJogadores; i++){
            String personagem = mkComponentes.getPersonagens().get(i);
            Jogador jogador = new Jogador(nomes.get(i), personagem);
            this.jogadores.add(jogador);
        }
    }

    @Override
    public String toString() {
        return this.jogadores.toString();
    }
}
