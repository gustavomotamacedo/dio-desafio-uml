public class Musica {
    private String nome;
    private double duracaoEmMinutos;
    public Musica(String nome, double duracaoEmMinutos) {
        this.nome = nome;
        this.duracaoEmMinutos  = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
