package Ferramentas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IniciaPartida  {

    private static InputStream entrada;
    private static  Reader leitor;
    private static BufferedReader bufferedReader;
    public static void iniciar() throws IOException {
        int numeroDeJogadores = 0;
        String continuar;
        do{
           numeroDeJogadores = perguntaNumeroDeJogadores();
        } while (!verificaNumeroDeJogadores(numeroDeJogadores));

        List<String> nomes = perguntaNomeDoJogador(numeroDeJogadores);

        do{
            Partida partida = new Partida(numeroDeJogadores, nomes);
            System.out.println("\n" + partida);
            System.out.print("\nDeseja Aleatorizar Novamente? (s/n): ");
            continuar = abrirELerConsole();
        } while(continuarJogando(continuar));
        encerrarSistema();
    }

    private static int perguntaNumeroDeJogadores() throws IOException {
        System.out.print("Digite o Número de Jogadores: ");
        return Integer.parseInt(abrirELerConsole());
    }
    private static boolean verificaNumeroDeJogadores(int numeroDeJogadores){
        return numeroDeJogadores <= 4 && numeroDeJogadores > 0;
    }

    private static List<String> perguntaNomeDoJogador(int numeroDeJogadores) throws IOException {
        List<String> nomes = new ArrayList<>();
        for(int i = 1; i <= numeroDeJogadores; i++){
            System.out.print("Jogador " + i + ": ");
            nomes.add(abrirELerConsole());
        }
        return nomes;
    }

    private static boolean continuarJogando(String resposta){
        return resposta.equals("s");
    }
    private static String abrirELerConsole() throws IOException {
        entrada = System.in;
        leitor = new InputStreamReader(entrada);
        bufferedReader = new BufferedReader(leitor);
        return bufferedReader.readLine();
    }

    private static void encerrarSistema() throws IOException {
        entrada.close();
        leitor.close();
        bufferedReader.close();
        System.exit(0);
    }
}
