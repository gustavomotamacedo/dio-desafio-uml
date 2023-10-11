import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<Musica> musicas;
    private int index;
    public ReprodutorMusical() {
        this.musicas = new ArrayList<>();
        this.index = 0;
    }
    public void iniciar() {
        System.out.println("Iniciando reprodutor musical");
    }
    public void encerrar() {
        System.out.println("Encerrando reprodutor musical");
    }
    public void avancarFaixa() {
        this.index += 1;
        Musica proxima = musicas.get(this.index);
        System.out.println("Avancando Faixa\nProxima faixa: " +  proxima);
    }
    public void voltarFaixa() {
        if (this.index > 0)
            this.index -= 1;
        else
            System.out.println("Sem faixas para voltar");
        Musica anterior = musicas.get(this.index);
        System.out.println("Voltando Faixa\nProxima faixa: " +  anterior);
    }
}
