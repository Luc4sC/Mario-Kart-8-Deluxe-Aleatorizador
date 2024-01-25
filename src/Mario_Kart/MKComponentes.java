package Mario_Kart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MKComponentes {

    private final List<String> personagens = new ArrayList<>();
    private final List<String> veiculos = new ArrayList<>();
    private final List<String> pneus = new ArrayList<>();
    private final List<String> paraquedas = new ArrayList<>();

    public MKComponentes() throws IOException {
        FileInputStream personagenstxt = new FileInputStream("personagens.txt");
        InputStreamReader leitor = new InputStreamReader(personagenstxt);
        BufferedReader buffer = new BufferedReader(leitor);

        String personagem = buffer.readLine();

        while(personagem != null){
            this.personagens.add(personagem);
            personagem = buffer.readLine();
        }

        buffer.close();

        FileInputStream veiculostxt = new FileInputStream("veiculos.txt");
        leitor = new InputStreamReader(veiculostxt);
        buffer = new BufferedReader(leitor);

        String veiculo = buffer.readLine();

        while(veiculo != null){
            this.veiculos.add(veiculo);
            veiculo = buffer.readLine();
        }

        buffer.close();

        FileInputStream pneustxt = new FileInputStream("pneus.txt");
        leitor = new InputStreamReader(pneustxt);
        buffer = new BufferedReader(leitor);

        String pneu = buffer.readLine();

        while(pneu != null){
            this.pneus.add(pneu);
            pneu = buffer.readLine();
        }

        buffer.close();

        FileInputStream paraquedastxt = new FileInputStream("paraquedas.txt");
        leitor = new InputStreamReader(paraquedastxt);
        buffer = new BufferedReader(leitor);

        String paraqueda = buffer.readLine();

        while(paraqueda != null){
            this.paraquedas.add(paraqueda);
            paraqueda = buffer.readLine();
        }

        buffer.close();
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public List<String> getVeiculos() {
        return veiculos;
    }

    public List<String> getPneus() {
        return pneus;
    }

    public List<String> getParaquedas() {
        return paraquedas;
    }

}
