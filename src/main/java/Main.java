import figura.Figura;
import figura.FiguraFactory;
import gestor.GestorFiguras;

public class Main {
    public static void main(String[] args) {
        GestorFiguras gestor = GestorFiguras.getInstancia();

        // Ajustando configuração padrão
        FiguraFactory.setConfigPadrao("azul", 3);

        // Criando figuras
        Figura c1 = FiguraFactory.criarFigura("circulo");
        Figura r1 = FiguraFactory.criarFigura("retangulo");

        gestor.adicionarFigura(c1);
        gestor.adicionarFigura(r1);

        // Mudando configuração padrão para novas figuras
        FiguraFactory.setConfigPadrao("vermelho", 5);

        Figura c2 = FiguraFactory.criarFigura("circulo");
        gestor.adicionarFigura(c2);

        // Listar todas
        gestor.listarFiguras();
    }
}
