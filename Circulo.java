public class Circulo extends Figura {
    public Circulo(String cor, int tamanho) {
        super(cor, tamanho);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo de cor " + cor + " e tamanho " + tamanho);
    }
}
