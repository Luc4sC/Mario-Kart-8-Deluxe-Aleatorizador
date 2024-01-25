package Mario_Kart;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Carro {

    private final String veiculo;
    private final String pneu;
    private final String paraqueda;

    public Carro() throws IOException {
        Random r = new Random();
        MKComponentes mkComponentes = new MKComponentes();
        List<String> veiculos = mkComponentes.getVeiculos();
        List<String> pneus = mkComponentes.getPneus();
        List<String> paraquedas = mkComponentes.getParaquedas();

        this.veiculo = veiculos.get(r.nextInt(veiculos.size()));
        this.pneu = pneus.get(r.nextInt(pneus.size()));
        this.paraqueda = paraquedas.get(r.nextInt(paraquedas.size()));
    }

    @Override
    public String toString() {
        return "{ Veículo: " + this.veiculo + ", Pneu: " + this.pneu + ", Paraqueda: " + this.paraqueda + " }";
    }
}
