public class Quadrado extends Figura {
    public Quadrado(String cor, int tamanho) {
        super(cor, tamanho);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Quadrado de cor " + cor + " e tamanho " + tamanho);
    }
}
