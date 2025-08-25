package gestor;

import figura.Figura;
import java.util.ArrayList;
import java.util.List;

public class GestorFiguras {
    private static GestorFiguras instancia;
    private List<Figura> figuras = new ArrayList<>();

    private GestorFiguras() {}

    public static GestorFiguras getInstancia() {
        if (instancia == null) {
            instancia = new GestorFiguras();
        }
        return instancia;
    }

    public void adicionarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void listarFiguras() {
        for (Figura f : figuras) {
            f.desenhar();
        }
    }
}
