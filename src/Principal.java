public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "La La Land";
        meuFilme.anoDeLancamento = 2016;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.Exibir();
        meuFilme.Avaliacao(8);
        meuFilme.Avaliacao(9);
        meuFilme.Avaliacao(8.5);
        meuFilme.Avaliacao(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.Medias());
    }
}