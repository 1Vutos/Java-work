import java.util.ArrayList;
import java.util.List;

public class GestorFiguras {
    private static GestorFiguras instancia;
    private List<Figura> figuras;

    private GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public static GestorFiguras getInstancia() {
        if(instancia == null) {
            instancia = new GestorFiguras();
        }
        return instancia;
    }

    public void adicionarFigura(Figura f) {
        figuras.add(f);
    }

    public void listarFiguras() {
        System.out.println("Lista de Figuras:");
        for(Figura f : figuras) {
            f.desenhar();
        }
    }
}
