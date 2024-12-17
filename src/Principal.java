import lucasbarros.screenmatch.calculos.CalculadoraDeTempo;
import lucasbarros.screenmatch.calculos.FiltroRecomendacao;
import lucasbarros.screenmatch.modelos.Episodio;
import lucasbarros.screenmatch.modelos.Filme;
import lucasbarros.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("La La Land");
        meuFilme.setAnoDeLancamento(2016);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.Exibir();
        meuFilme.Avaliacao(8);
        meuFilme.Avaliacao(9);
        meuFilme.Avaliacao(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.Medias());

        Serie b99 = new Serie();
        b99.setNome("Brooklyn 99");
        b99.setAnoDeLancamento(2014);
        b99.Exibir();
        b99.setTemporadas(8);
        b99.setEpisodiosPorTemporada(19);
        b99.setMinutosPorEpisodio(20);
        System.out.println("Duração para maratonar " + b99.getNome() + ": " + b99.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Clube da Luta");
        outroFilme.setAnoDeLancamento(1999);
        outroFilme.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(b99);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.Filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(b99);
        episodio.setTotalVisualizacoes(300);
        filtro.Filtrar(episodio);

    }
}