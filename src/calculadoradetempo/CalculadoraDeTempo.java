package calculadoradetempo;

import br.com.poo.screenmatch.modelos.Series;
import br.com.poo.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo extends Titulo{
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui (Titulo Titulo ) {
        this.tempoTotal += Titulo.getDuracaoEmMinutos();
    }

}
