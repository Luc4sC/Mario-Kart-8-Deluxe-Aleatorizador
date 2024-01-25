import Mario_Kart.Partida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aleatorizar {
    public static void main(String[] args) throws IOException {
        String verificacao = "s";
        List<String> nomes = new ArrayList<>();

        System.out.print("Digite o Número de Jogadores: ");
        InputStream teclado = System.in;
        Reader leitor = new InputStreamReader(teclado);
        BufferedReader buffer = new BufferedReader(leitor);

        String linha = buffer.readLine();
        int numJogadores = Integer.parseInt(linha);

        if(numJogadores > 4){
            System.out.println("\nSão permitido no máximo 4 Jogadores");
            throw new RuntimeException();
        }

        for(int i = 1; i <= numJogadores; i++){
            System.out.print("Jogador " + i + ": ");
            teclado = System.in;
            leitor = new InputStreamReader(teclado);
            buffer = new BufferedReader(leitor);
            linha = buffer.readLine();
            nomes.add(linha);
        }

        while(verificacao.equals("s")){
            Partida partida = new Partida(numJogadores,nomes);
            System.out.println("\n" + partida);

            System.out.print("\nDeseja Aleatorizar Novamente? (s/n): ");
            teclado = System.in;
            leitor = new InputStreamReader(teclado);
            buffer = new BufferedReader(leitor);

            verificacao = buffer.readLine().toLowerCase();
        }

        buffer.close();
        System.exit(0);
    }
}