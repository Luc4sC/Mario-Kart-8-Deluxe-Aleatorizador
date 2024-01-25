package Mario_Kart;

import java.io.IOException;

public class Jogador {

    private final String nome;
    private final String personagem;
    private final Carro carro;

    public Jogador(String nome, String personagem) throws IOException {
        this.nome = nome;
        this.personagem = personagem;
        this.carro = new Carro();
    }

    @Override
    public String toString() {
        return "\nPlayer: " + this.nome + "\nPersonagem: " + this.personagem + "\nCarro: " + this.carro + "\n";
    }
}
