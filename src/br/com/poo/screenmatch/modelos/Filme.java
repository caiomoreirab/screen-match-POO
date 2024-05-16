package br.com.poo.screenmatch.modelos;

import calculadoradetempo.Classificacao;

public class Filme extends Titulo implements Classificacao {
  private String diretor;

  public String getDiretor() {
   return diretor;
  }

  public void setDiretor(String diretor) {
   this.diretor = diretor;
  }

    @Override
    public int getClassificacao() {
        return 0;
    }

    public static class Principal {
      public static void main(String[] args) {
          Filme meuFilme = new Filme(); //criação do objeto
          meuFilme.setNome("Velozes e Furiosos");
          meuFilme.setTotalDeAvaliacoes(0);
          meuFilme.setIncluidoNoPlano(true);
          meuFilme.setDuracaoEmMinutos(127);

  //        System.out.println(meuFilme.nome);
  //        System.out.println(meuFilme.incluidoNoPlano); //imprimindo dados

  //        //chamando os métodos:
  //        meuFilme.exibeFichaTecnica();
  //        meuFilme.avalia(9);
  //        meuFilme.avalia(7);
  //        meuFilme.avalia(10);
  //
  ////        System.out.println(meuFilme.pegaMedia());
  //
  //        meuFilme.setNome("Velozes2");
  //        System.out.println(meuFilme.getNome("Velozes2"));

      }
  }
 }

