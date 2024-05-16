package calculadoradetempo;

import br.com.poo.screenmatch.modelos.Filme;
import br.com.poo.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {

    public void filtra(Classificacao classificavel) {
        if (classificavel.getClassificacao()>=4) {
            System.out.println("Filme entre os preferidos!!");

        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Entre os bons");
        } else  {
            System.out.println("Assista depois!");
        }
    }
}
