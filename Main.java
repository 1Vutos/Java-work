public class Main {
    public static void main(String[] args) {
        GestorFiguras gestor = GestorFiguras.getInstancia();

        // Criando figuras via Factory + Prototype
        Figura c1 = FiguraFactory.criarFigura("circulo");
        Figura q1 = FiguraFactory.criarFigura("quadrado");
        Figura c2 = FiguraFactory.criarFigura("circulo");

        // Adicionando no Singleton
        gestor.adicionarFigura(c1);
        gestor.adicionarFigura(q1);
        gestor.adicionarFigura(c2);

        // Listando todas as figuras
        gestor.listarFiguras();
    }
}
