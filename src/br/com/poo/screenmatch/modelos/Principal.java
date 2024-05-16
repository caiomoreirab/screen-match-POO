package br.com.poo.screenmatch.modelos;

import br.com.poo.screenmatch.modelos.Filme;
import calculadoradetempo.CalculadoraDeTempo;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Velozes e Furiosos");
        meuFilme.setTotalDeAvaliacoes(0);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(127);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.0);
        meuFilme.avalia(7.0);
        meuFilme.avalia(10.0);
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setNome("Velozes2");
//        System.out.println(meuFilme.getNome("Velozes2"));

        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAtiva(true);
        lost.setAnoDeLancamento(1987);
        meuFilme.exibeFichaTecnica();
        lost.exibeFichaTecnica();
        lost.setTemporadas(1);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(47);
//        System.out.println(lost.getDuracaoEmMinutos());

//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(lost);
//        calculadora.inclui(meuFilme);
//        System.out.println(calculadora.getDuracaoEmMinutos());


        //testanto a calculadora:
//        lost.setDuracaoEmMinutos(200);
        meuFilme.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();  //criando a calculadora como objeto da classe dela
        calculadora.inclui(lost); //chamando o metodo e incluindo o tempo dos filmes
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal()); //Imprimindo na tela a calculadora com o valor da variavel de contador
    }
}
