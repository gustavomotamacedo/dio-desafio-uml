public class AparelhoCelular {
    private ReprodutorMusical reprodutorMusical;
    private Navegador  navegador;

    public AparelhoCelular() {
        reprodutorMusical = new ReprodutorMusical();
        navegador = new Navegador();
    }
    public void ligar() {
        System.out.println("Ligando aparelho");
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void iniciarNavegador() {
        navegador.iniciar();
    }
    public void iniciarReprodutorMusical() {
        reprodutorMusical.iniciar();
    }
    public void encerrarNavegador() {
        navegador.encerrar();
    }
    public void encerrarReprodutorMusical() {
        reprodutorMusical.encerrar();
    }
}
